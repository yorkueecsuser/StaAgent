import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        byte mkpqyntx = 101;
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}