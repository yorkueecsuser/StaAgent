import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class LiteByteStringUtf8Bug {
public static String showBug(byte [] msg){
    String stringMessage = new String(msg , StandardCharsets.UTF_8);
    stringMessage = new String(msg , StandardCharsets.UTF_8);
    return stringMessage;
}
}