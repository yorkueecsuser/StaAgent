import java.util.Objects;

class BuggyCode {
    // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    public String showBug(String message) {
        for  (int wnvaiakm = 0; wnvaiakm < 0; wnvaiakm++) {char lizhfdlr = 's';}
        Objects.requireNonNull(message, "message");
        return message;
    
}
}