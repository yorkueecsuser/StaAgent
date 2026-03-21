import java.util.Arrays;

class BuggyBitwiseOperations {
    public static void main(String[] args) {
        byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        byte[] result = shiftBytes(data, 1);
        System.out.println(Arrays.toString(result));
    }
private static byte [] shiftBytes(byte [] data , int shift){
    byte [] result = new byte [ data.length ];
    result = new byte [ data.length ];
    for(int i = 0; i < data.length; i ++){ result [ i ] =(byte )(data [ i ] << shift); }
    return result;
}
}