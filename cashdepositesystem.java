import java.util.Scanner;
class deposite{
    private String depositeID;
    private double ammount;
    private int duration;
    private double rate;


    public void setDepositeID(String id){
        this.depositeID = id;
    }
    public void setDuration(int d){
        this.duration = d;
    }
    public void setAmmount(double amm){
        this.ammount = amm;
    }
    public void setRate(double r){
        this.rate = r;
    }
      public String getDepositeID(){
        return depositeID;
    }
    public double getAmmount(){
        return ammount;
    }
    public int getDuration(){
        return duration;
    }
    public double getRate(){
        return rate;
    }
    public void input(){
        Scanner scs = new Scanner(System.in);
        System.out.println("Enter the Deposit ID: ");
        String id = scs.nextLine();
        System.out.println("Enter the ammount: ");
        double amm = scs.nextDouble();
        System.out.println("Enter the duration: ");
        int d = scs.nextInt();
        System.out.println("Enter the rate: ");
        double r = scs.nextDouble();

        setDepositeID(id);
        setAmmount(amm);
        setDuration(d);
        setRate(r);
    }
    public double findinterest(){
        double intamm = 0;
        if(duration > 1){
            intamm = ammount * 0.65;
            return intamm;
        }
        else if(duration > 2){
            intamm = ammount * 0.12;
            return intamm;
        }
        else if(duration > 5){
            intamm = ammount * 0.15;
        }
        else {
            return ammount;
        }
        double annualinterest = ammount * rate;
        return annualinterest;
    }
    public void display(){
        System.out.println("Deposit ID: " + getDepositeID());
        System.out.println("Deposit Ammount: " + getAmmount());
        System.out.println("Duration: " + getDuration());
        System.out.println("Rate: " + getRate());
        System.out.println("Annual interest ammount: " + findinterest());
    }
}
class systemdrive{
    public static void main(String args[]){
        deposite dp = new deposite();
        deposite dp2 = new deposite();

        dp.input();
        dp.display();
        dp2.input();
        dp2.display();
    }
}
