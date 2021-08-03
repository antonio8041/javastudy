package ch02;

//Customer 속성 : 고객아이디, 이름, 등급, 보너스 포인트, 보너스 포인트 정립비율
//일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
public class Customer {
    //private int customerID; //고객의 정보는 중요한 정보이므로 private / private은 외부 class에서 접근 불가능
    //private String customerName;
    //private String customerGrade;

    //protected : 하위 class에서는 접근 가능하지만 외부 class에서는 접근이 불가능하다
    protected int customerID; 
    protected String customerName;

    //getter setter 구현
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    //VIP에 대한 변수
    // int agentID;
    // double salesRatio;

    public Customer () {
        customerGrade = "SILVER"; //기본 등급
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        //if else if문이 많이 들어 가면 class의 상속을 생각해봐야한다
        // if (customerGrade == "SILVER"){ //추가적인 요구조건이 발생하게되면 class의 단일성이 망가진다
        //     bonusPoint += price * bonusRatio;
        // }
        // else if (customerGrade == "VIP") {....}
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " Your Grade is " + customerGrade + " bonusPoint is " + bonusPoint;
    }


}
