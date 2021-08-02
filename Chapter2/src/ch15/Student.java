package ch15;

public class Student {
    String studentName;
    int money;
    // int payment;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
        
    }

    public void takeTexi(Texi texi){
        texi.take(10000);
        this.money -= 10000;
    }

    public void showStudentInfo() {
		System.out.println(studentName +" " + money);
	}

}

