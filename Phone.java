public class Phone {
    private String type;
    private int price;
    private boolean isAvailiable;

    public Phone(String type, int price, boolean isAvailiable) {
        this.type = type;
        this.price = price;
        this.isAvailiable = isAvailiable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailiable() {
        return isAvailiable;
    }

    public void setAvailiable(boolean availiable) {
        isAvailiable = availiable;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", isAvailiable=" + isAvailiable +
                '}';
    }

    public void applyDiscount(int percantage){
        System.out.println("With discount: " + (price)*percantage/100 + " HRK");

    }

    public void orderNew(){
        if (isAvailiable){
            System.out.println("The phone is already in stock!");
        }
        else {
            isAvailiable=true;
            System.out.println("The phone is now in stock!");
        }
    }


}