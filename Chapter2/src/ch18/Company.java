package ch18;
//singleton pattern
public class Company {
    private static Company instance = new Company(); //유일한 객체
    private Company() { //외부에서 생성자를 새롭게 생성하지 못하도록
        
    }

    public static Company getInstance() { //static 이유 : 외부에서 class이름으로 method를 사용할 수 있다
        if (instance == null){ //방어적 코드
            instance = new Company();
        }
        return instance;
    }
}
