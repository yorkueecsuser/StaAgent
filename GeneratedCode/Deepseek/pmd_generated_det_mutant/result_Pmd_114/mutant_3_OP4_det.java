import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        if (false && false && false && false && false && true && true && false && true && true && false) {float ybiyqlhk = 934424692;}else{float jskocnrb = 937757494;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}