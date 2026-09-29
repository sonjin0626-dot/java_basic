package chapter_11.section_11_3;

public class ShelfAi {
    public static void main(String[] args) {
        int copies = 5;

        // 1つ目の繰り返し（すべての本を棚に入れる）
        for (int i = 1; i <= copies; i++) {
            System.out.println(i + "冊目を棚に入れました");
        }

        System.out.println(copies + "冊すべて入れ終わりました");

        System.out.println("--- 2つ目の処理を始めます ---");

        // 2つ目の繰り返し（3冊目をスキップする）
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // 3のときはこれより下の処理を飛ばして次のループへ
            }
            System.out.println(i + "冊目");
        }
    }
}
