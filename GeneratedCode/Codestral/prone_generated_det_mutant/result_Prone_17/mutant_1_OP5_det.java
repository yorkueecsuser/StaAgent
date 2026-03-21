import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        int wagpotfx = 0;switch  (wagpotfx) {case 1:float wdcwrobe = 528444303;break;default:char lubknrcl = 'g';break;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}