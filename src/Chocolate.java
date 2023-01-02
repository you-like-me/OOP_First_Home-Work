
public class Chocolate extends Product{

    public Chocolate(String name, double price, String filling) {
        super(name, price);
        this.setFilling(filling);
    }
    private String filling;

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String toString()  {
        return String.format("%s - %s", super.toString(), filling);
    }
}