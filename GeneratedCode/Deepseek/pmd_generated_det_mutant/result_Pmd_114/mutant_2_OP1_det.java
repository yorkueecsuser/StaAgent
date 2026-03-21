import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        double uzskygvr = 356261316;
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}