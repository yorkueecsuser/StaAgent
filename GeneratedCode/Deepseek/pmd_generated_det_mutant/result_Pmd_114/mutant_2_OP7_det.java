import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        boolean hfetroai = false;while (hfetroai && false && false && false && true && false && false && true && false && false && true && false) {float ldvbiuja = -777131854;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}