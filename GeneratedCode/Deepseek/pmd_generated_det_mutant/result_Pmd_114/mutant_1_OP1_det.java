import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        int cbtgwpej = 840672505;
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}