import java.util.Arrays;

class BitwiseBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] mask = {0x1, 0x2, 0x4, 0x8, 0x10};
        int value = 0x100;

        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        if (false && false && false && false && false && false && false && true && true && false && false) {float welchkne = -304743105;}else{short tplwvvhx = -6360;}
        if ((value & mask[0]) == mask[1]) {
            System.out.println("Value is present in the array");
        } else {
            System.out.println("Value is not present in the array");
        }
    
}
}