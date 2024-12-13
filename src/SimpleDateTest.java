public class SimpleDateTest {
    public static void main(String[] args) {
        SimpleDate test = new SimpleDate(29, 12, 2023);
//        test.advance();
//        System.out.println(test);
//        test.advance(5);
//        System.out.println(test);
        System.out.println("Friday of the examined week is: " + test);

        SimpleDate futureDate = test.afterNumberOfDays(7);
        int week = 1;
        while (week <= 1) {
            System.out.println("Friday after " + week + " weeks is " + futureDate);
            //futureDate = futureDate.afterNumberOfDays(7);
            week++;
        }
        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }
}
