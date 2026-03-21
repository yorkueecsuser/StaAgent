import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        boolean ajdysftq = false;while (ajdysftq && false && true && false && false && true && true && true && true && false && true && false) {short zbdjwgaf = -9821;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}