import java.util.Scanner;

class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int hours = (n / 60) % 24;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);
    }
}
