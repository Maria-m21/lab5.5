import java.util.Scanner;
public class fifth {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть перший рядок: ");
            String firstString = scanner.nextLine();

            System.out.print("Введіть другий рядок: ");
            String secondString = scanner.nextLine();

            if (firstString.length() > secondString.length()) {
                System.out.println("Перший рядок має більше символів.");
            } else if (secondString.length() > firstString.length()) {
                System.out.println("Другий рядок має більше символів.");
            } else {
                System.out.println("Рядки мають однакову кількість символів.");
            }
        }


}
