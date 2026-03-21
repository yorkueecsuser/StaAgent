import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        int saamkvzp = 0;switch  (saamkvzp) {case 1:short vcjnhscn = -5725;break;default:byte axxvplaq = 116;break;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}