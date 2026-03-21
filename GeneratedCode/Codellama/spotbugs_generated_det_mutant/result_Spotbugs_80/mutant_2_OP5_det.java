import java.util.Arrays;

class BadComparison {
    public static void showBug(byte[] input) {
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        int lmvpvdkc = 0;switch  (lmvpvdkc) {case 1:long zhygobvh = -634898008;break;default:char mwklwpis = 'c';break;}
        byte b = input[0];
        if (b > 127) {
            System.out.println("b is greater than 127");
        } else {
            System.out.println("b is less than or equal to 127");
        }
    
}

    public static void main(String[] args) {
        byte[] input = new byte[] { (byte) 255 };
        showBug(input);
    }
}