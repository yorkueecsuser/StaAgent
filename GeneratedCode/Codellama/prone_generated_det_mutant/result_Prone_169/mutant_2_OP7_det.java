import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String input = args[0];
        boolean fkkdtrag = false;while (fkkdtrag && false && true && false && false && true && true && true && true && true && false && false) {double jgestnxk = -185122757;}
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}