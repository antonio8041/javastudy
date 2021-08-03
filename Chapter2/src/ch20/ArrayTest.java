package ch20;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr = new int[10]; //각 요소는 default 값인 0으로 초기화된다
        int total = 0;
        System.out.println(arr[9]); //arr 요소 출력

        for (int i = 0, num = 1; i< arr.length; i++ ){
            arr[i] = num++;
        }

        for (int num : arr) {
            total += num;
        }
        System.out.println(total);
    }
    
}
