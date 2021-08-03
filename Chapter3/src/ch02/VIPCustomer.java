package ch02;
//매출에 더 많은 기여를 하는 단골 고객
//제품을 살때 10%를 할인해 줌
//보너스 포인트는 제품 가격의 5%를 적립해 줌
//담당 전문 상담원이 배정됨

public class VIPCustomer extends Customer{ //classA extends classB : classA는 classB에게 상속 받는다 /classA : 하위 class,  classB : 상위 class
    //Customer 클래스에 추가해서 구현하는 것은 좋지 않음
    //VIPCustomer 클래스를 따로 구현
    //이미 Customer에 구현된 내용이 중복되므로 Customer를 확장하여 구현함(상속)
    // private int customerID;
    // private String customerName;
    // private String customerGrade;
    // int bonusPoint;
    // double bonusRatio;

    private int agentID;
    double salesRatio;
    
    public VIPCustomer() {
        customerGrade = "VIP"; //Error >>> private으로 선언되어 있었기 때문에 / Customer class의 customerGraded의 접근 제어자를 private에서 protected로 바꿈
        bonusRatio = 0.05;
		salesRatio = 0.1;
    }
    public int getAgentID() {
		return agentID;
	}

    
}
