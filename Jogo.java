public class Jogo {
     int[][] grade = new int[3][3];


    public void mostrarGrade(){
     System.out.println("====================================");


     System.out.println(mostrarSimbolo(grade[0][0])+" | "+mostrarSimbolo(grade[0][1])+" | "+mostrarSimbolo(grade[0][2]));
     System.out.println(mostrarSimbolo(grade[1][0])+" | "+mostrarSimbolo(grade[1][1])+" | "+mostrarSimbolo(grade[1][2]));
     System.out.println(mostrarSimbolo(grade[2][0])+" | "+mostrarSimbolo(grade[2][1])+" | "+mostrarSimbolo(grade[2][2]));


     System.out.println("====================================");
    }
     public String mostrarSimbolo(int i) {
          if(i == 1) return "X";
          if(i == 2) return "O";
          return ".";
        }

    public void pegarPosicao(Controle controle){
        System.out.println("Digite as suas posições");
        int pos1 = Controle.lerInt();
        int pos2 = Controle.lerInt();
        grade[pos1][pos2] = 1;
    }
}
