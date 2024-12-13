package test;

public class MultiDimArray {
    public static void main(String[] args) {
        String[][] names = {
                {"Mr.", "Ms. ", "Hero "},
                {"Milan","Meelan", "LamaDon"},
                {"Testing","HelloWorld"},
                {"test","array"}
        };

        System.out.println(names[0][2] + names[1][1]);
        System.out.println(names[0][2] + names[1][0]);
        // Length of array
        System.out.println(names.length);

    }
}
