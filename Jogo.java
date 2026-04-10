public class Jogo {
        int[][] grade = new int[3][3];
        CondicaoDeVitoria cv = new CondicaoDeVitoria();
        Controle controle = new Controle();

        public void mostrarGrade(){
                System.out.println("====================================");

                System.err.println("  0   1   2");

                System.out.println("0 "+mostrarSimbolo(grade[0][0])+" | "+mostrarSimbolo(grade[0][1])+" | "+mostrarSimbolo(grade[0][2]));
                System.out.println("1 "+mostrarSimbolo(grade[1][0])+" | "+mostrarSimbolo(grade[1][1])+" | "+mostrarSimbolo(grade[1][2]));
                System.out.println("2 "+mostrarSimbolo(grade[2][0])+" | "+mostrarSimbolo(grade[2][1])+" | "+mostrarSimbolo(grade[2][2]));


                System.out.println("====================================");
        }
        public String mostrarSimbolo(int i) {
                if(i == 1) return "X";
                if(i == 2) return "O";
                return ".";
        }
        public void pegarPosicao(Controle controle, Jogador jogador){
                System.out.println("Digite as suas posições");
                while(true) {
                        
                        int pos1 = Controle.lerInt();
                        int pos2 = Controle.lerInt();
                        
                        if(!espacoLivre(pos1, pos2)) {
                                System.out.println("Posição inserida invalida");
                                continue;
                        }
                        grade[pos1][pos2] = jogador.simbolo;
                        break;
                }
        }
        public boolean espacoLivre(int linha, int coluna) {
                return grade[linha][coluna] == 0;
        }
        public void iniciarJogo(Jogador j1, Jogador j2){
                System.out.println("Começou o embate");

                while (!cv.fimDeJogo(this)) {
                        System.out.println("Jogo rolando");
                        pegarPosicao(controle, j1);
                        mostrarGrade();
                        pegarPosicao(controle, j2);
                        mostrarGrade();
                }
                System.out.println("Você venceu!");
        }
}
