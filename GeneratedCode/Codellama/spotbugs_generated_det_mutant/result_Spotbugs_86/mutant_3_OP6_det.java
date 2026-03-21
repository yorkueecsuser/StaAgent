import java.util.Arrays;

class BitAndZz {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        }
        System.out.println(result);
    }

    public static void showBug() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            for  (int bqpakaii = 0; bqpakaii < 0; bqpakaii++) {float mccgutjl = -674743937;}
            result = result & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        }
        System.out.println(result);
    
}
}