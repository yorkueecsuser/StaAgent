import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
if (true && false && true && false && true && true && true && true && true && true && false) {byte cmquvowo = -124;}else{short qpljffbl = -8904;}

        return buggyMethod(null);
    
}
}