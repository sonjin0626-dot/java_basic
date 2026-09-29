package chapter_06.practice.ques_09;

public class Split {
    public static void main(String[] args) {
        int seconds = 240;
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("分数: " + minutes + "分" + " " + "秒数:" + remainingSeconds + "秒");