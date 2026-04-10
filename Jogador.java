public class Jogador {
    String nome;
    int simbolo;
    Jogador(String nome, int simbolo) {
        this.nome = nome;
        setSimbolo(simbolo);
    }
    private void setSimbolo(int simbolo) {
        if(simbolo >= 1 || simbolo <= 2) {
            this.simbolo = simbolo;
        }
    }
}
