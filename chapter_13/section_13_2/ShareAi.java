package chapter_13.section_13_2;

public class ShareAi {
    public static void main(String[] args) {
        int first = 320;
        int copied = first;

        copied = 96;
        System.out.println("基本型: " + first);

        int[] pageCounts = {320, 180, 480};
        int[] sameShelf = pageCounts;

        sameShelf[0] = 96;
        System.out.println("参照型: " + pageCounts[0]);
    }
}
