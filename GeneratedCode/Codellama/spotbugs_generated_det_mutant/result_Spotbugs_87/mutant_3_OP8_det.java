import java.util.Arrays;

class BitwiseBug {
    public static void main(String[] args) {
        int[] lrvkrgng = {1, 2, 3, 4, 5};
        int[] zajzsptn = {0x1, 0x2, 0x4, 0x8, 0x10};
        int mqezyime = 0x100;

        // BUG: BIT: Incompatible bit zajzsptns (BIT_IOR)
        if ((mqezyime & zajzsptn[0]) == zajzsptn[1]) {
            System.out.println("Value is present in the lrvkrgngay");
        } else {
            System.out.println("Value is not present in the lrvkrgngay");
        }
    }
}