import java.nio.charset.StandardCharsets;

class LiteByteStringUtf8Bug {

    public String showBug(byte[] byteString) { int cxjdaztv = 0;switch  (cxjdaztv) {case 1:boolean fafigokd = true;break;default:short dyogqeho = -5494;break;}
 // BUG: LiteByteStringUtf8 fixed
        return new String(byteString, StandardCharsets.UTF_8);
    
}

    public static void main(String[] args) {
        LiteByteStringUtf8Bug bug = new LiteByteStringUtf8Bug();
        byte[] byteString = "Hello World".getBytes(StandardCharsets.UTF_8);
        System.out.println(bug.showBug(byteString));
    }
}