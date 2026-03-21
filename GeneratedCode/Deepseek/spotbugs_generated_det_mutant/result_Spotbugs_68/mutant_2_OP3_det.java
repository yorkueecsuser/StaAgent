import java.util.Objects;

class BuggyCode {
    // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    public String showBug(String message) {
        if (true && true && false && false && true && false && false && false && true && true && false) {byte spqspsvw = -40;}
        Objects.requireNonNull(message, "message");
        return message;
    
}
}