package test;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";

        StringBuilder demo = new StringBuilder(palindrome);

        demo.reverse();
        System.out.println(demo);
    }
}
