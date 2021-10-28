package algoritmo;

import static algoritmo.Produto.buscaMenor;

public class Carro {
    public static void main(String[] args) {

        try {
            Produto produtos[] = {
                    new Produto("Lamborghini", 1000000),
                    new Produto("Jipe", 46000),
                    new Produto("Brasília", 16000),
                    new Produto("Smart", 46000),
                    null,
                    new Produto("Fusca", 17000)
            };

            int maisBarato = buscaMenor(produtos);

            System.out.println(maisBarato);
            System.out.println("O carro " + produtos[maisBarato].getNome()
                    + " é o mais barato, e custa "
                    + produtos[maisBarato].getPreco());

        } catch (NullPointerException exception) {
            System.out.println("Seu array está vazio ");
        }
    }
}

