import java.util.Scanner;

class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number / 10) % 10);
    }
}
