import java.util.Objects;

class BuggyCode {
    // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    public String showBug(String message) {
        if (false && false && true && true && true && true && false && false && false && true && false) {byte ubqnvuec = -52;}else{String ifretvhx = "lmcolpgk";}
        Objects.requireNonNull(message, "message");
        return message;
    
}
}