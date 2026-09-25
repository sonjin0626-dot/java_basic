package chapter_06.practice.ques_06;

public class Counter {
    public static void main(String[] args) {
        int totalPages = 300;
        int bookmarkedPage = 120;
        int remainingPages = totalPages - bookmarkedPage;

        System.out.println("本の総ページ数: " + totalPages);
        System.out.println("しおりを挟んだページ: " + bookmarkedPage);
        System.out.println("残りのページ数: " + remainingPages);
    }
}
