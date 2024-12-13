package test;

public class ConditionalDemo {
    public static void main(String[] args) {
        int value1 = 8;
        int value2 = 2;
        int result;
        //Ternary operator
        /*This operator is also known as the ternary operator because it uses three operands.
        In the following example, this operator should be read as:
        "If someCondition is true, assign the value of value1 to result. Otherwise, assign the value of value2 to result."*/
         boolean someCondition = false;
         result = value1 > value2 ? value1 : value2;
        System.out.println(result);
    }
}
