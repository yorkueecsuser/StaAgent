import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        boolean qljcormg = false;while (qljcormg && false && false && true && false && false && false && false && true && false && true && false) {boolean qaauesbr = false;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}