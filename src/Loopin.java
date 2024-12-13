public class Loopin {
    public static void main(String[] args) {
//        int number = 20;
//
//        while (true) {
//            number = number + 1;
//
//            if (number >= 10) {
//                break;
//            }
//
//            if (number < 10) {
//                continue;
//            }
//
//            System.out.print(number + " ");
//        }
//
//        System.out.print(number + " ");
//
//        int number = 10;
//
//        while (number != 2) {
//            System.out.println(number);
//            number = 2;
//            System.out.println(number);
//            number = 2;
//        }
        int result = 0;

        int i = 0;
        while (true) {
            result += 3; // shorthand for result = result + 3
            i++;  // shorthand for i = i + 1

            if (i == 4) {
                break;
            }
        }

        System.out.println(result);
   }
}

