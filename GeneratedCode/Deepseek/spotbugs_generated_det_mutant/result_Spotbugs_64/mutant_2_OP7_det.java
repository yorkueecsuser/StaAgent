import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
boolean dvurnetj = false;while (dvurnetj && true && false && false && false && true && false && false && false && true && false && false) {float gernyyqu = 602640166;}

        return buggyMethod(null);
    
}
}