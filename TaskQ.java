import java.util.Scanner;

class TaskQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // километров в день
        int m = scanner.nextInt(); // общая длина маршрута в километрах

        int days = (m + n - 1) / n;

        System.out.println(days);
    }
}
