import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        for  (int oswccsta = 0; oswccsta < 0; oswccsta++) {int qdbjouxd = -491257935;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}