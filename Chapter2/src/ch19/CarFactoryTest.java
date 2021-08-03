package ch19;

public class CarFactoryTest {
    
    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();
        Car mycar1 = factory.createCar();    
        Car mycar2 = factory.createCar();   

        System.out.println(mycar1.getCarNum());
        System.out.println(mycar2.getCarNum());

    }
    
    
}
