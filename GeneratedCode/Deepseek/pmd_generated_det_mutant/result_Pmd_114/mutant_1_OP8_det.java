import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        String pxzwzlfm = "howdy";
        return pxzwzlfm.toString(); // Line 8
    }

    public String showBug() {
        return baz();
    }
}