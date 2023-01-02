
public class Tea extends Product{

    public Tea(String name, double price, String type, String flavor) {
        super(name, price);
        this.setType(type);
        this.setFlavor(flavor);
    }

    private String type;
    private String flavor;


    public String getType() {
        return type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String toString()  {
        return String.format("%s - %s - %s", super.toString(), type, flavor);
    }
}