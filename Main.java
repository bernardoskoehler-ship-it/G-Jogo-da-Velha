public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Controle c = new Controle();
        Jogador jogador = new Jogador("jogador", 1);
        Jogador jogador2 = new Jogador("jogador", 2);

        jogo.iniciarJogo(jogador, jogador2);

    }
}
 
