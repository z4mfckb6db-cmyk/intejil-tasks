import java.util.Scanner;

class TaskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int diff = a - b;
        int M = 2000;
        int sign = (diff + M) / M;

        int absDiff = sign * diff + (1 - sign) * (-diff);
        int max = (a + b + absDiff) / 2;

        System.out.println(max);
    }
}
