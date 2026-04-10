public class CondicaoDeVitoria {
    int nomeVencedor;

    private boolean vColuna(Jogo jogo) {
        for (int coluna = 0; coluna < 3; coluna++) {
            int valor = jogo.grade[0][coluna];

            if (valor != 0 &&
                    valor == jogo.grade[1][coluna] &&
                    valor == jogo.grade[2][coluna]) {
                nomeVencedor = valor;
                return true;
            }
        }
        return false;
    }

    private boolean vLinha(Jogo jogo) {
        for (int linha = 0; linha < 3; linha++) {
            int valor = jogo.grade[linha][0];

            if (valor != 0 &&
                    valor == jogo.grade[linha][1] &&
                    valor == jogo.grade[linha][2]) {
                nomeVencedor = valor;
                return true;
            }
        }
        return false;
    }
    private boolean deuEmpate(Jogo jogo) {
        int valor = 0;
        for(int linha = 0; linha < 3; linha ++) {
            for(int coluna = 0; coluna < 3; coluna ++) {
                if(jogo.grade[linha][coluna] != 0) {
                    valor ++;
                }
            }
        }
        return valor == 9;
    }



    //Possibilidades de resultado
    private boolean venceu(Jogo jogo){
        nomeVencedor = 0;
        return vLinha(jogo) || vColuna(jogo);
    }

    private boolean empate(Jogo jogo) {
        return deuEmpate(jogo);
    }

    public boolean fimDeJogo(Jogo jogo) {
        return empate(jogo) || venceu(jogo);
    }
}
