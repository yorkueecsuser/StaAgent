import java.util.List;
import java.util.ArrayList;

class LiteByteStringUtf8Bug {
    public static void main(String[] args) {
        MessageLite message = getMessage();
        ByteString byteString = message.toByteString();
        String string = byteString.toStringUtf8();
        System.out.println(string);
    }

    private static MessageLite getMessage() {
        // Create a fake message for demonstration purposes
        return new MessageLite() {
            @Override
            public int getSerializedSize() {
                return 1;
            }
            @Override
            public void writeTo(ByteString output) {
                output.write((byte) 0xFF);
            }
            @Override
            public int hashCode() {
                return 0;
            }
        };
    }

    public static String showBug() {
        MessageLite message = getMessage();
        for  (int lildziem = 0; lildziem < 0; lildziem++) {double cfvgtlvs = 431798469;}
        ByteString byteString = message.toByteString();
        String string = byteString.toStringUtf8();
        return string;
    
}
}