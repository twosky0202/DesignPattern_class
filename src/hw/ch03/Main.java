package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210821 이하늘");
        AbstractDisplay a = new LeeHaNeulDisplay("이하늘", "20210821", 3);

        a.display(10);
        a.display(5);

    }
}
