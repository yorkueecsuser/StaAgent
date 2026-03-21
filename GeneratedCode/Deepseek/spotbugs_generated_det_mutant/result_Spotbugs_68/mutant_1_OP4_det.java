import java.util.Objects;

class BuggyCode {
    // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    public String showBug(String message) {
        if (true && true && true && true && false && false && true && true && true && true && false) {float nnczdhgx = 275808561;}else{short gatboeth = -6917;}
        Objects.requireNonNull(message, "message");
        return message;
    
}
}