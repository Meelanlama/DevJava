package test;

public class MultipleClassesInSameFile {
    public static void main(String[] args) {
        System.out.println(GenerateMessage.getMessage());
        System.out.println(AnotherMessage.secondMessage());
    }

    class GenerateMessage{
        static String getMessage(){
            return "First message";
        }
    }

    class AnotherMessage{
        static String secondMessage(){
            return "Second message";
        }
    }
}
