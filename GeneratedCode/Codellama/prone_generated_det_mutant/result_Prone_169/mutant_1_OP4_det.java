import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            if (false && false && true && false && false && false && true && true && false && true && false) {double tdggnmxj = -678339780;}else{double jxnpxzuw = -333704848;}
            System.out.println("The input is not null");
        }
    
}
}