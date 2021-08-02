package ch15;

public class TakePayTest {
    public static void main(String[] args) {
        Student student1 = new Student("potter", 20000);


        Texi texi1 = new Texi("kakao", 155123);


        student1.takeTexi(texi1);

        student1.showStudentInfo();

        texi1.showTexiInfo();
    }
}