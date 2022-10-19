import java.math.BigDecimal;

public class Order {
    //One line coment
    /*
    Multiple line coments
    Hey Hey

     */
//    totalPrice
//    wight
//    volume
//    itemeCount
//    width
//    height
//    addres
    String text =" some text here";
    Character e ='h';
    private double totalPrice;
    private double wight;
    private double volume;
    private int itemCount;
    private double width;
    private double height;
    private double dept;
    private String adress;
    private boolean deleveryRequsted;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Character getE() {
        return e;
    }

    public void setE(Character e) {
        this.e = e;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDept() {
        return dept;
    }

    public void setDept(double dept) {
        this.dept = dept;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isDeleveryRequsted() {
        return deleveryRequsted;
    }

    public void setDeleveryRequsted(boolean deleveryRequsted) {
        this.deleveryRequsted = deleveryRequsted;
    }

}
