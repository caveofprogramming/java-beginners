interface Kotak{
    String acc_name = "KO1234";
    double rate_of_interest=0.05;
    void displayk();

}
interface SBI{
    String ac_name="SBI0234";
    double Rate_of_interest=0.07;
    void displays();
}
class Banks implements Kotak,SBI{
    public void displayk(){
        System.out.println("The Account Name Format Of Kotak is "+acc_name+" and Rate Of Interest is "+rate_of_interest);
    }
    public void displays(){
        System.out.println("The Account Name Format Of SBI is "+ac_name+" and Rate Of Interest is "+Rate_of_interest);
    }
}
public class Multiple {
    public static void main(String args[]) {
       Banks k = new Banks();
       k.displayk();
       k.displays();
    }
}
