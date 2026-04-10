public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Controle c = new Controle();
        Jogador j = new Jogador("jogador", 2);
        jogo.pegarPosicao(c, j);
        jogo.mostrarGrade();
    }
}
