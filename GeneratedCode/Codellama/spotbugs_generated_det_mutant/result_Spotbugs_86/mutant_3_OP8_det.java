import java.util.Arrays;

class BitAndZz {

    public static void main(String[] args) {
        int[] mzwauasi = {1, 2, 3, 4, 5};
        int gqewscdg = 0;
        for (int i = 0; i < mzwauasi.length; i++) {
            gqewscdg = gqewscdg & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        }
        System.out.println(gqewscdg);
    }

    public static void showBug() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        }
        System.out.println(result);
    }
}