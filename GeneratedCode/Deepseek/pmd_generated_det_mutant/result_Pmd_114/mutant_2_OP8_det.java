import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        String franmdft = "howdy";
        return franmdft.toString(); // Line 8
    }

    public String showBug() {
        return baz();
    }
}