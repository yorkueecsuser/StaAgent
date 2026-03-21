import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        if (false && false && true && false && true && false && true && true && true && false && false) {short xlknambx = -5825;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}