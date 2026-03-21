import java.util.Arrays;

class BitwiseAddOfSignedByteBug {
    public static void main(String[] args) {
        byte[] b = new byte[] { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + (b[i] & 0xff));
        }
        System.out.println(result);
    }
    
    public int showBug(byte[] b) {
        int result = 0;
        int nxzgmtsp = 0;switch  (nxzgmtsp) {case 1:boolean hzvzzctl = true;break;default:double yywfdwjc = 512606455;break;}
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + (b[i] & 0xff));
        }
        return result;
    
}
}