import java.util.Scanner;
public class second {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть п'ять слів:");
            String word1 = scanner.next();
            String word2 = scanner.next();
            String word3 = scanner.next();
            String word4 = scanner.next();
            String word5 = scanner.next();

            char firstLetter1 = word1.charAt(0);
            char firstLetter2 = word2.charAt(0);
            char firstLetter3 = word3.charAt(0);
            char firstLetter4 = word4.charAt(0);
            char firstLetter5 = word5.charAt(0);

            System.out.println("Перші літери слів:");
            System.out.println("1. " + firstLetter1);
            System.out.println("2. " + firstLetter2);
            System.out.println("3. " + firstLetter3);
            System.out.println("4. " + firstLetter4);
            System.out.println("5. " + firstLetter5);
        }


}
