import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        if (false && false && false && false && true && true && false && true && false && true && false) {float ojcimxqq = -345537723;}else{short zwilwafw = -6561;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}