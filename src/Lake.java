/**
 * Created by DELL on 7/25/2017.
 */
public class Lake extends Pool {
    private String Sand;

    public Lake(int Pay, String Water, String Sand) {
       super(Pay, Water);
       this.Sand = Sand;
    }

    public String getSand() {
        return Sand;
    }

    public void setSand(String sand) {
        Sand = sand;
    }
}
