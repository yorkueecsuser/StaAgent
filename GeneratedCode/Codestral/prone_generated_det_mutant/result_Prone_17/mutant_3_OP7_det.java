import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        boolean pukkoybp = false;while (pukkoybp && true && false && false && false && false && true && false && false && true && true && false) {short ntvxikda = 8865;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}