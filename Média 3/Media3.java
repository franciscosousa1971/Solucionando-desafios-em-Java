package javaaplicacao;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Media3 {
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        double n1, n2, n3, n4, media, emexame, emexamefinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.printf("Aluno aprovado.\n");
        } else if (media < 5.0) {
            System.out.printf("Aluno reprovado.\n");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Aluno em exame.\n");

            emexame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", emexame);

            emexamefinal = (emexame + media) / 2;

            if (emexamefinal >= 5.0) {
                System.out.printf("Aluno aprovado.\n");
            } else {
                System.out.printf("Aluno reprovado\n"); // mensagem sem ponto na string
            }
            System.out.printf("Media final: %.1f\n", emexamefinal);
        }

        sc.close();
    }
 
}
