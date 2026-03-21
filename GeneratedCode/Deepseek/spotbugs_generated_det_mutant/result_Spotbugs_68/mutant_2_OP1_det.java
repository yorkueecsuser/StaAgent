import java.util.Objects;

class BuggyCode {
    // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    public String showBug(String message) {
        byte swqwizba = 16;
        Objects.requireNonNull(message, "message");
        return message;
    
}
}