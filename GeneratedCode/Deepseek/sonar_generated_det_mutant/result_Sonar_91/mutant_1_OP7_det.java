import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        boolean velsjoob = false;while (velsjoob && true && false && false && true && false && false && false && true && false && false && false) {char xwomliyi = 'w';}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}