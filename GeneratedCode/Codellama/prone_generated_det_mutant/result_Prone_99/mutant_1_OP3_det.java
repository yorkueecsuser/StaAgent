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
        ByteString byteString = message.toByteString();
        if (false && true && false && true && false && true && true && false && false && false && false) {boolean unxcvhsr = false;}
        String string = byteString.toStringUtf8();
        return string;
    
}
}