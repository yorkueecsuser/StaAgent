import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        for  (int feyhpvld = 0; feyhpvld < 0; feyhpvld++) {int smillqtx = 426454565;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}