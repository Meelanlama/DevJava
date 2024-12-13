package test;

public class StringDemoPalindrome {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
//        System.out.println(palindrome.length());

        for(int i=0; i< len; i++){
            tempCharArray[i] = palindrome.charAt(i);
        }

        for(int j=0; j<len; j++){
            charArray[j]= tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
