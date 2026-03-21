import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int dsxohmkb = 2;
        int ukatymuj = 2;
        int xosrbsha = dsxohmkb ^ ukatymuj;
        Sukatymujstem.out.println(xosrbsha); // BUG: XorPower
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}