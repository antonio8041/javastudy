package ch20;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alpahbets = new char[26]; //문자타입의 26개의 요소를 가진 빈 alpahbets배열 생성 
        char ch = 'A'; 
        for (int i=0; i<alpahbets.length; i++){
            alpahbets[i] = ch++;
            // System.out.println(alpahbets[i]);
        }

        for (char alpha : alpahbets){
            System.out.println(alpha + ", " + (int)alpha);
        }
    }
}
