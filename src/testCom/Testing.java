package testCom;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        WordSet set = new WordSet();
//
//        UserInterface userInterface = new UserInterface(set,scanner);
//        userInterface.start();

        int number = 0;

        while (true){
            number = number +1;

            if(number >=6){
                break;
            }

            if(number <6){
                continue;
            }
        }
        System.out.println(number + " ");
    }
}
