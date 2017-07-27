/**
 * Created by DELL on 7/25/2017.
 */
public class MainApp {
    public static void main(String[] args) {

        Pool Pool1 = new Pool (25, "Merky" );
        Lake Lake1 = new Lake(10, "Clear", "White");

        System.out.println(Pool1.getPay());
        Pool1.setPay(15);
        System.out.println(Pool1.getPay());
        System.out.println(Lake1);
        System.out.println(Pool1);
    }
}
