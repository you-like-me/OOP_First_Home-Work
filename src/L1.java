
import java.util.ArrayList;
import java.util.List;

public class L1 {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine", 12));
        tovary.add(new Product("dust", 10));
        tovary.add(new Soda("kind", 19, "grapes"));

        /**Home work*/
        tovary.add(new Chocolate("bounty", 8, "kokos"));
        tovary.add(new Chocolate("snickers", 4, "caramel"));
        tovary.add(new Tea("tess", 2, "green", "bergamot"));
        tovary.add(new Tea("lipton", 6, "black", "camomile"));
        tovary.add(new Tea("java", 4, "red", "no flavor"));



        VendingMachine mach2 = new VendingMachine(tovary);
        System.out.println(mach2);
        System.out.println(mach2.findByName("java"));
        System.out.println(mach2.findByPrice(4));
        System.out.println(mach2.findByPriceRange(2, 8));





    }
}