import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        for  (int gdfhuglz = 0; gdfhuglz < 0; gdfhuglz++) {char bnlhwvad = 'r';}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}