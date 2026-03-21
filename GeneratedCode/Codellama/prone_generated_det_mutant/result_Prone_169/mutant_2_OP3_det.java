import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        if (true && false && false && true && false && false && true && true && true && false && false) {long xxiiqlyi = 237370663;}
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}