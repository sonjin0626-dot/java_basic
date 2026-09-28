package chapter_10.practice.ques_08;

public class ShelfNumber {
    public static void main(String[] args) {
        int genreNumber = 1;

        String shelfNumber = switch (genreNumber) {
            case 1 -> "A-01";
            case 2 -> "B-02";
            case 3 -> "C-03";
            default -> "未分類";
        };

        System.out.println(shelfNumber);
    }
}
