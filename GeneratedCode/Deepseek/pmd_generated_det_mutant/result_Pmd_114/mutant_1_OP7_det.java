import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        boolean wnqronkh = false;while (wnqronkh && true && true && true && false && false && true && false && false && true && true && false) {short eutszwxk = 9719;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}