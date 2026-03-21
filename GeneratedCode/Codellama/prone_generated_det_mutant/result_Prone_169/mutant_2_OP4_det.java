import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (false && false && false && true && false && false && true && false && true && false && false) {String mcibkjsi = "vylxlixk";}else{boolean hjxemqpe = false;}
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}