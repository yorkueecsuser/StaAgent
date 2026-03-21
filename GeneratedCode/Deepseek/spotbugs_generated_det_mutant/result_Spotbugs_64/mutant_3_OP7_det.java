import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
boolean jtbhirdh = false;while (jtbhirdh && true && false && true && true && true && true && true && false && false && false && false) {short iwcjdtma = -584;}

        return buggyMethod(null);
    
}
}