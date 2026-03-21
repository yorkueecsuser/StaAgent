import java.util.Arrays;

class BitAndZz {

    public static void main(String[] args) {
        int[] xpcieyjm = {1, 2, 3, 4, 5};
        int wzymjcrr = 0;
        for (int i = 0; i < xpcieyjm.length; i++) {
            wzymjcrr = wzymjcrr & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        }
        System.out.println(wzymjcrr);
    }

    public static void showBug() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        }
        System.out.println(result);
    }
}