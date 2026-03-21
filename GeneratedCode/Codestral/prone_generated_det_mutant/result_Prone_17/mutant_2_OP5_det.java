import static java.util.Objects.requireNonNull;

class CheckNotNullMultipleTimesBug {
    public String showBug(String input) {
        // BUG: CheckNotNullMultipleTimes
        int knoxcxiv = 0;switch  (knoxcxiv) {case 1:float xcdsnkop = -420233942;break;default:char daxtxnzo = 'b';break;}
        requireNonNull(input);
        requireNonNull(input); // input is checked for null twice
        return input.toUpperCase();
    
}
}