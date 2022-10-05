public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung S22",9000,true);
        Phone phone2 = new Phone("Samsung S21",7000,false);

        phone1.applyDiscount(50);
        phone1.orderNew();
        phone2.applyDiscount(80);
        phone2.orderNew();
    }
}