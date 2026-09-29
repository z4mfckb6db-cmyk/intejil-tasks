import java.util.Scanner;

class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int hours = (n / 3600) % 24;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }
}
