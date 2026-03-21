import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        long znsidfkp = 668395203;
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}