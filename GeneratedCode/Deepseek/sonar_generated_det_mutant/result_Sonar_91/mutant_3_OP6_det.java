import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        for  (int wexxxest = 0; wexxxest < 0; wexxxest++) {long whfcmbeo = -454981708;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}