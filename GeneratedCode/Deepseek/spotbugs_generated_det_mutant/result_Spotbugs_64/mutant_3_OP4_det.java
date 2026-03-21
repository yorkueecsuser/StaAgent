import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
if (true && false && false && false && false && true && false && true && true && true && false) {short cogkzvhd = -9231;}else{byte fyoliisk = -19;}

        return buggyMethod(null);
    
}
}