public class TestCounter {
    public static void main(String[] args) {
//        Counter test = new Counter();
//        test.increase();
//        test.increase();
//        System.out.println(test);
//
//        Counter cloneTest = test.clone();
//        System.out.println(cloneTest);
//        cloneTest.increase();
//        System.out.println(cloneTest);

            Thread t1 = new Thread();
            Thread t2 = new Thread();
            Thread t3 = t1;

            String s1 = new String("GEEKS");
            String s2 = new String("GEEKS");

            System.out.println(t1 == t3);
            System.out.println(t1 == t2);
            System.out.println(s1 == s2);

            System.out.println(t1.equals(t2));
            System.out.println(s1.equals(s2));
    }
}

