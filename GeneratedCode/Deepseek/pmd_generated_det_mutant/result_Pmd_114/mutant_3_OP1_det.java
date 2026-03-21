import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        long tykfcham = 776426956;
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}