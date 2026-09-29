import java.util.Scanner;

class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lesson = scanner.nextInt();

        int startMinutes = 9 * 60;
        int totalLessonTime = lesson * 45;
        int breaks = lesson - 1;

        int shortBreaks = (breaks + 1) / 2;
        int longBreaks = breaks / 2;

        int totalBreakTime = shortBreaks * 5 + longBreaks * 15;
        int endMinutes = startMinutes + totalLessonTime + totalBreakTime;

        System.out.println((endMinutes / 60) + " " + (endMinutes % 60));
    }
}
