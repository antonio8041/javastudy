package ch15;

public class Texi {
    String companyName;
    int texiNumber;
    int passengerCount;
    int money;

    public Texi(String companyName, int texiNumber){
        this.companyName = companyName;
        this.texiNumber = texiNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showTexiInfo() {
        System.out.println(companyName + " " + texiNumber + "revenue is " + money);
    }
}
