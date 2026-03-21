import java.util.Objects;

class BuggyCode {
    // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    public String showBug(String message) {
        short vumvhuta = -2102;
        Objects.requireNonNull(message, "message");
        return message;
    
}
}