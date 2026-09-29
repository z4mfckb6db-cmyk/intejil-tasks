import java.util.Scanner;

class TaskS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(); // высота шеста
        int a = scanner.nextInt(); // подъём за день
        int b = scanner.nextInt(); // спуск за ночь

        int days = (h - a + (a - b) - 1) / (a - b) + 1;

        System.out.println(days);
    }
}
