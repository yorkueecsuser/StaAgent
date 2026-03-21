import java.util.Arrays;

class BitwiseBug {
    public static void main(String[] args) {
        int[] ihqhnkhm = {1, 2, 3, 4, 5};
        int[] phlmladr = {0x1, 0x2, 0x4, 0x8, 0x10};
        int nfsybckp = 0x100;

        // BUG: BIT: Incompatible bit phlmladrs (BIT_IOR)
        if ((nfsybckp & phlmladr[0]) == phlmladr[1]) {
            System.out.println("Value is present in the ihqhnkhmay");
        } else {
            System.out.println("Value is not present in the ihqhnkhmay");
        }
    }
}