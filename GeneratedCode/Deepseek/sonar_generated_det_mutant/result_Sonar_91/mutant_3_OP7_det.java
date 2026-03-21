import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        boolean fuotgiok = false;while (fuotgiok && false && false && false && true && false && false && false && true && true && false && false) {boolean rhowtqwf = false;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}