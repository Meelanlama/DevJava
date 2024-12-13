package test;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[8];
        System.arraycopy(copyFrom,0,
                copyTo,0,8);
        for (String coffee: copyTo){
            System.out.print(coffee + " ");
        }
    }
}

// Using java.util.Arrays which is short
class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}

