import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        String qficfeqd = "howdy";
        return qficfeqd.toString(); // Line 8
    }

    public String showBug() {
        return baz();
    }
}