import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        if (true && true && true && false && true && true && false && false && false && false && false) {byte inylaosr = -79;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}