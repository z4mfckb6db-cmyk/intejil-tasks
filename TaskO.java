import java.util.Scanner;

class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int totalKopecks = (a * 100 + b) * n;

        System.out.println((totalKopecks / 100) + " " + (totalKopecks % 100));
    }
}
