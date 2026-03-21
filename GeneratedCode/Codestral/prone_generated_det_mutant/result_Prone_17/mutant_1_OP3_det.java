import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        if (false && true && false && false && false && true && true && true && false && false && false) {long hnifjhul = 768203981;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}