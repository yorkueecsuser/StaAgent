import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        String bar = "howdy";
        return bar.toString(); // Line 8
    }

    public String showBug() {
        return baz();
    }
}