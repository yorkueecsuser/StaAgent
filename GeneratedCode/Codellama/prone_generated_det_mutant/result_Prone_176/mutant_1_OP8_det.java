import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int lxwqcdgt = 2;
        int vxgilnro = 2;
        int sxulujgr = lxwqcdgt ^ vxgilnro;
        Svxgilnrostem.out.println(sxulujgr); // BUG: XorPower
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}