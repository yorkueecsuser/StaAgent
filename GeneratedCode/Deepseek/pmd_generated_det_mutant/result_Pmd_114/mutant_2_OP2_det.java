import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
private String baz() {
    String bar = "howdy";
    bar = "howdy";
    return bar.toString();
}

    public String showBug() {
        return baz();
    }
}