import java.util.Objects;

class BuggyCode {
    // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    public String showBug(String message) {
        if (false && false && true && true && false && true && true && false && false && false && false) {char qkqvfrnp = 'q';}
        Objects.requireNonNull(message, "message");
        return message;
    
}
}