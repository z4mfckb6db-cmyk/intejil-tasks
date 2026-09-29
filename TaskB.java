import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The next number for the number " + number + " is " + (number + 1) + ".");
        System.out.println("The previous number for the number " + number + " is " + (number - 1) + ".");
    }
}
