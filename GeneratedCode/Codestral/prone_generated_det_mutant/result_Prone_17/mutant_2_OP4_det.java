import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        if (false && false && true && true && true && false && false && false && false && true && false) {double glztnveu = 472130771;}else{long jlvrhzzc = 514403559;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}