import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        boolean llkybepk = false;while (llkybepk && false && true && false && false && false && false && true && true && true && true && false) {byte xekyroqr = -51;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}