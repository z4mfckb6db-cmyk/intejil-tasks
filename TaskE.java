import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int length = 109;
        int distance = v * t;
        int position = ((distance % length) + length) % length;
        System.out.println(position);
    }
}
