package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerYun = new VIPCustomer();
        customerYun.setCustomerName("Yunyoungmin");
		customerYun.setCustomerID(0111);
		customerYun.bonusPoint = 10000;
        System.out.println(customerYun.showCustomerInfo());

        Customer customerLee = new Customer();
		customerLee.setCustomerName("Leesunsin");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());


    }
}
