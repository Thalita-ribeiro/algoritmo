package algoritmo;

import static algoritmo.Produto.ordena;

public class Carro {
    public static void main(String[] args) {

        try {
            Produto produtos[] = {
                    new Produto("Lamborghini", 1000000),
                    new Produto("Jipe", 46000),
                    new Produto("Brasília", 16000),
                    new Produto("Smart", 46000),
                    new Produto("Fusca", 17000)
            };

            ordena(produtos, produtos.length);

            for(Produto produto : produtos) {
                System.out.println(produto.getNome() + " custa " + produto.getPreco()); }

        } catch (NullPointerException exception) {
            System.out.println("Seu array está vazio ");
        }
    }
}