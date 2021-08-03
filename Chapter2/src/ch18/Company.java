package ch18;
//singleton pattern
//프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
//static 변수, 메서드를 활용하여 구현 할 수 있음


public class Company {
    private static Company instance = new Company(); //클래스 내부에 유일한 private 인스턴스 생성
    private Company() { //외부에서 생성자를 새롭게 생성하지 못하도록 / 생성자는 private으로 선언
        
    }

    //외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
    public static Company getInstance() { //static 이유 : 외부에서 class이름으로 method를 사용할 수 있다
        if (instance == null){ //방어적 코드
            instance = new Company();
        }
        return instance;
    }
}
