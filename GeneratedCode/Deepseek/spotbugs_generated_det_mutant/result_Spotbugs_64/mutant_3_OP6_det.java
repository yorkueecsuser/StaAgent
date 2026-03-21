import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
for  (int wwtgwlsl = 0; wwtgwlsl < 0; wwtgwlsl++) {String ikxzinml = "yvnjkhwn";}

        return buggyMethod(null);
    
}
}