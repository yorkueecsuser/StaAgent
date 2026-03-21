import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        for  (int mtjuwlgz = 0; mtjuwlgz < 0; mtjuwlgz++) {short hhpkwaye = 5124;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}