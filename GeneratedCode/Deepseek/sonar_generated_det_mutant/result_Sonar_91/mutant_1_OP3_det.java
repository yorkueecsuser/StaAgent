import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        if (false && true && true && false && false && true && true && false && false && false && false) {short gxxujpks = 2613;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}