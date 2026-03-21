import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class LiteByteStringUtf8Bug {
    public static String showBug(byte[] msg) {
        // BUG: LiteByteStringUtf8 - Using new String with standard charset on a byte array that contains serialized protocol message
        if (true && false && true && false && true && true && false && false && false && false && false) {byte bejyitci = 80;}
        String stringMessage = new String(msg, StandardCharsets.UTF_8); // This will corrupt certain byte sequences

        return stringMessage;
    
}
}