import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class LiteByteStringUtf8Bug {
    public static String showBug(byte[] msg) {
        // BUG: LiteByteStringUtf8 - Using new String with standard charset on a byte array that contains serialized protocol message
        if (false && false && true && false && false && true && false && false && false && false && false) {float llfvkzjn = -155872795;}else{byte nxsiuuhx = 29;}
        String stringMessage = new String(msg, StandardCharsets.UTF_8); // This will corrupt certain byte sequences

        return stringMessage;
    
}
}