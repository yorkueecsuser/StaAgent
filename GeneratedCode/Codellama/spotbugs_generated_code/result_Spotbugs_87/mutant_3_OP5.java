import java.util.Arrays;

class BitwiseBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] mask = {0x1, 0x2, 0x4, 0x8, 0x10};
        int value = 0x100;

        // Unreachable switch statement mutant
        int switchValue = getSwitchValue();
        switch (switchValue) {
            case 0:
                System.out.println("Unreachable code");
                break;
        }

        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        if ((value & mask[0]) == mask[1]) {
            System.out.println("Value is present in the array");
        } else {
            System.out.println("Value is not present in the array");
        }
    }

    private static int getSwitchValue() {
        return 0;
    }
}