package algoritmo;

public final class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

        int maisBarato = inicio;

        for (int atual = inicio; atual < termino; atual++) {

            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {

                maisBarato = atual;
            }
        }

        return maisBarato;
    }

    public static void ordena(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < produtos.length; atual++) {

            int menor = buscaMenor(produtos, atual, produtos.length);

            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }
}