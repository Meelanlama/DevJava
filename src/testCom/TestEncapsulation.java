package testCom;
//A Java class to test the encapsulated class Account.

public class TestEncapsulation {
    public static void main(String[] args) {
        Account acc = new Account();

        //Setting value
        acc.setName("Milan Tamang");
        acc.setAcc_no(1234567L);
        acc.setAmount(100000f);
        acc.setEmail("lamameelan32@gmail.com");

        //getting value
        System.out.println(acc.getName()+" " +acc.getAcc_no() +" " +acc.getAmount() +" "+ acc.getEmail());
    }
}
