/**
 * Created by DELL on 7/25/2017.
 */
public class Pool {
    private int Pay;
    private String Water;

    public Pool(int Pay, String Water) {
        this.Pay = Pay;
        this.Water = Water;
    }

    public int getPay() {
        return Pay;
    }

    public void setPay(int Pay) {
        this.Pay = Pay;
    }

    public String getWater() {
        return Water;
    }

    public void setWater(String Water) {
        this.Water = Water;
    }
}
