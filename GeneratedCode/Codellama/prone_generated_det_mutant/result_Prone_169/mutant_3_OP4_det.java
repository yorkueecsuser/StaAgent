import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String input = args[0];
        if (true && false && false && true && false && false && false && false && false && false && false) {byte cvlbewwf = -41;}else{short ctrppppr = 1866;}
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}