import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        if (false && false && false && true && false && true && false && true && false && false && false) {double xibpelql = -216066198;}else{double siahahuw = 244296415;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}