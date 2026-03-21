import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        for  (int fwxvwiyl = 0; fwxvwiyl < 0; fwxvwiyl++) {char cezmcqqt = 'x';}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}