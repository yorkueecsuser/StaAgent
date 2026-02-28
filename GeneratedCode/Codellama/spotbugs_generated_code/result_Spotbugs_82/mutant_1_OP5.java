import java.util.Arrays;

class BitwiseAddOfSignedByteBug {
    public static void main(String[] args) {
        byte[] b = new byte[] { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + (b[i] & 0xff));
        }
        System.out.println(result);

        // Unreachable switch statement mutant code
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable switch statement executed");
                break;
            default:
                break;
        }
    }

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + (b[i] & 0xff));
        }
        return result;
    }

    // Unreachable switch statement mutant code
    public int getValue() {
        return 0;
    }
}