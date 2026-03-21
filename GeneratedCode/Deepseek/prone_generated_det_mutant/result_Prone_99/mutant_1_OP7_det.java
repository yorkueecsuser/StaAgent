import java.nio.charset.StandardCharsets;

class LiteByteStringUtf8Bug {

    public String showBug(byte[] byteString) { boolean uwvmaalp = false;while (uwvmaalp && true && true && true && false && false && true && true && true && true && false && false) {byte gpzcaaxp = 121;}
 // BUG: LiteByteStringUtf8 fixed
        return new String(byteString, StandardCharsets.UTF_8);
    
}

    public static void main(String[] args) {
        LiteByteStringUtf8Bug bug = new LiteByteStringUtf8Bug();
        byte[] byteString = "Hello World".getBytes(StandardCharsets.UTF_8);
        System.out.println(bug.showBug(byteString));
    }
}