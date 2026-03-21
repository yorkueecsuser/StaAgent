import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class LiteByteStringUtf8Bug {
    public static String showBug(byte[] msg) {
        // BUG: LiteByteStringUtf8 - Using new String with standard charset on a byte array that contains serialized protocol message
        int mlvdrpub = 0;switch  (mlvdrpub) {case 1:long jtwgnzqz = 180821667;break;default:float bygqslep = -573311291;break;}
        String stringMessage = new String(msg, StandardCharsets.UTF_8); // This will corrupt certain byte sequences

        return stringMessage;
    
}
}