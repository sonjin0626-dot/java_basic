package chapter_10.practice.ques_07;

public class DayOfWeekAi {
    public static void main(String[] args) {
        System.out.println("曜日を表す番号（1から7）を入力してください：");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int dayNumber = scanner.nextInt();

        String result = switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> "平日です。";
            case 6, 7 -> "週末です。";
            default -> "1から7までの番号を入力してください。";
        };

        System.out.println(result);
    }
}
