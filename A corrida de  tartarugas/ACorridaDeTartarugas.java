package javaaplicacao;

import java.io.*;

public class ACorridaDeTartarugas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantidadeEntradas = 3;

        while (quantidadeEntradas > 0) {
            int numeroQuantidade = Integer.parseInt(br.readLine());

            if (numeroQuantidade >= 1 && numeroQuantidade <= 500) {
                String[] tartarugas = br.readLine().split(" ");
                int maiorVelocidade = Integer.parseInt(tartarugas[0]);

                for (int i = 1; i < numeroQuantidade; i++) {
                    int tartaruga = Integer.parseInt(tartarugas[i]);

                    if (tartaruga > maiorVelocidade) {
                        maiorVelocidade = tartaruga;
                    }
                }

                if (maiorVelocidade < 10) {
                    System.out.println(1);
                } else if (maiorVelocidade >= 10 && maiorVelocidade < 20) {
                    System.out.println(2);
                } else if (maiorVelocidade >= 20) {
                    System.out.println(3);
                }
                quantidadeEntradas--;
            } else {
                System.out.println("Insira um número entre 1 e 500");
            }
        }
    }
}
