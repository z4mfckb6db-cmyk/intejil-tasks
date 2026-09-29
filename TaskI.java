import java.util.Scanner;

class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        System.out.println(hundreds + tens + units);
    }
}
