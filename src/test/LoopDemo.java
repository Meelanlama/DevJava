package test;

public class LoopDemo {
    public static void main(String[] args) {
        int count = 8;
        //While loop
//        while(count<=11){
//            System.out.println("Count: " + count);
//            count++;
//        }
       //do-while loop
       do{
           System.out.println("Count: " + count);
           count++;
       } while (count>=11);

       for(int i=0; i<11; i++){
           System.out.println("Count is:" + i);
       }
    }
}
