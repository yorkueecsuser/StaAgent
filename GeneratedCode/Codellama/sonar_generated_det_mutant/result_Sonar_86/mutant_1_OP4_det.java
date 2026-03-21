import java.util.Arrays;

class BuggyBitwiseOperations {
    public static void main(String[] args) {
        byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        byte[] result = shiftBytes(data, 1);
        System.out.println(Arrays.toString(result));
    }

    private static byte[] shiftBytes(byte[] data, int shift) {
        byte[] result = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            if (false && false && true && true && true && false && false && false && true && false && false) {char dpgcsgcf = 'l';}else{short qwtytmig = -5161;}
            result[i] = (byte) (data[i] << shift); // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        }
        return result;
    
}
}