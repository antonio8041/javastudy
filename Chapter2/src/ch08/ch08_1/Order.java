package ch08.ch08_1;

public class Order {

    public String orderNumber;
    public String customerPhone;
    public String customerAddress;
    public String orderDate;
    public String orderTime;
    public int price;
    public String menuId;

    public void showOrderDetail() {

        System.out.println("ordernumber : " + orderNumber);
        System.out.println("customerphone : " + customerPhone);
        System.out.println("customeraddress : " + customerAddress);
        System.out.println("orderdate : " + orderDate);
        System.out.println("ordertime : " + orderTime);
        System.out.println("menuid : " + menuId);
        
    }
}




