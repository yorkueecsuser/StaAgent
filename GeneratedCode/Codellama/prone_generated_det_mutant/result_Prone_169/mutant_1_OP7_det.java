import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        boolean zllpcxxl = false;while (zllpcxxl && false && false && false && true && false && true && true && false && true && true && false) {byte tdiugdkk = 27;}
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}