class account{
    String Name_Of_Depositer;
    String Account_Number;
    String Type_Of_Account;
    int Balance;
    account(){
        Name_Of_Depositer="XYZ";
        Account_Number= "A1002";
        Type_Of_Account="Savings Account";
        Balance= 15000;
    }
    void deposit(int depo_amount){
            Balance=Balance+depo_amount;
            System.out.println(depo_amount+" Has Been Successfully Deposited in Your Account");
            System.out.println("Your Total Balance Is Rs "+Balance);

    }
    void display(){
        System.out.println(Name_Of_Depositer+" your account balance is Rs"+Balance);
    }

}
public class Account1 {
    public static void main(String args[]){
        account obj = new account();
        obj.deposit(30000);
        obj.display();
    }
}
