import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        if (false && false && true && true && false && false && false && true && true && true && false) {short sqcnmmpq = 3955;}else{String eqtzrfxc = "rdaydpnn";}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}