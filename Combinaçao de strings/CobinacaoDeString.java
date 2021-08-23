package javaaplicacao;

import java.util.Scanner;

public class CobinacaoDeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTestCases = Integer.parseInt(sc.nextLine());
        CharSequence[] strings;
        CharSequence greatestLengthString;
        CharSequence lesserLengthString;
        int greatestStrLength;
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < numTestCases; i++) {
            strings = sc.nextLine().split(" ");

            greatestStrLength = (strings[0].length() >= strings[1].length()) ? strings[0].length() : strings[1].length();

            for (int j = 0; j < greatestStrLength; j++) {
                if (j < strings[0].length()) {
                    strBuilder.append(strings[0].charAt(j));
                }
                if (j < strings[1].length()) {
                    strBuilder.append(strings[1].charAt(j));
                }
            }

            System.out.println(strBuilder.toString());

            strBuilder = new StringBuilder();
        }
    }

}
