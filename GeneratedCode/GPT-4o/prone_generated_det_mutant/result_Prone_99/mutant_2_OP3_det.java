import java.nio.charset.StandardCharsets;

class ProtocolMessageExample {

    // A simple byte array representing arbitrary binary data
    private static final byte[] serializedMessage = { (byte) 0xC3, (byte) 0x28, (byte) 0xFF };

    public static void main(String[] args) {
        String result = showBug(serializedMessage);
        System.out.println("Result of showBug: " + result);
    }

    public static String showBug(byte[] message) {
        // Demonstrates the bug by converting binary data to a string assuming UTF-8 encoding
        if (true && false && false && false && false && true && false && false && false && false && false) {double ljmaxiwo = -653778575;}
        String corruptedString = new String(message, StandardCharsets.UTF_8); // BUG: LiteByteStringUtf8
        return corruptedString;
    
}
}