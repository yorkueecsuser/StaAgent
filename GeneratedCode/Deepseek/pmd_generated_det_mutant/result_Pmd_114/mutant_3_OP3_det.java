import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        if (false && true && true && false && true && true && true && false && false && true && false) {double knusnafu = 679035165;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}