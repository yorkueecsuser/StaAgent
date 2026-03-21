import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        if (false && true && true && false && true && false && true && false && true && false && false) {float xaxulbjh = 965414437;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}