import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        if (true && true && true && false && false && true && true && false && true && true && false) {String zfbmtcqz = "mbodsfpk";}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}