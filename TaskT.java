import java.util.Scanner;

class TaskT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        int result = Math.abs(d1 - d4) + Math.abs(d2 - d3) + 1;

        System.out.println(result);
    }
}
