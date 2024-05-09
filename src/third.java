import java.util.Scanner;
public class third {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть три числа:");
            double number1 = readDouble(scanner);
            double number2 = readDouble(scanner);
            double number3 = readDouble(scanner);

            double maxFractionalNumber = Math.max(Math.max(number1, number2), number3);

            if (isFractionalNumber(maxFractionalNumber)) {
                System.out.println("Найбільше дробове число: " + maxFractionalNumber);
            } else {
                System.out.println("Введено не дробове число.");
            }
        }

        public static double readDouble(Scanner scanner) {
            System.out.print("Введіть число: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Некоректне значення. Введіть число: ");
                scanner.next();
            }
            return scanner.nextDouble();
        }

        public static boolean isFractionalNumber(double number) {
            return number % 1 != 0;
        }


}
