import java.nio.charset.StandardCharsets;

class LiteByteStringUtf8Bug {

    public String showBug(byte[] byteString) { int rnqjveaz = 0;switch  (rnqjveaz) {case 1:float bjuxpnmi = -991473658;break;default:int icedcblr = 910949804;break;}
 // BUG: LiteByteStringUtf8 fixed
        return new String(byteString, StandardCharsets.UTF_8);
    
}

    public static void main(String[] args) {
        LiteByteStringUtf8Bug bug = new LiteByteStringUtf8Bug();
        byte[] byteString = "Hello World".getBytes(StandardCharsets.UTF_8);
        System.out.println(bug.showBug(byteString));
    }
}