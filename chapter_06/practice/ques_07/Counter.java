package chapter_06.practice.ques_07;

public class Counter {
    public static void main(String[] args) {
        int totalSweets = 20;
        int people = 6;
        int sweetsPerPerson = totalSweets / people;
        int remainingSweets = totalSweets % people;

        System.out.println("1人あたりのお菓子の個数: " + sweetsPerPerson);
        System.out.println("配りきれずに残るお菓子の個数: " + remainingSweets);
    }
}
