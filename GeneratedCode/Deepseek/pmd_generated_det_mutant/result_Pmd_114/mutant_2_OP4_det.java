import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        if (true && true && false && false && true && false && false && true && true && true && false) {char ukllhfan = 'd';}else{long wbrkqbkp = -954099759;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}