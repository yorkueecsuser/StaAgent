import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        boolean wjdxbyjo = false;while (wjdxbyjo && true && false && false && true && true && false && true && true && true && false && false) {double osmomxlq = -12841586;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}