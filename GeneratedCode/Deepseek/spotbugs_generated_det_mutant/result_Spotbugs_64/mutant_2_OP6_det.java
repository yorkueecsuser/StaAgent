import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
for  (int hkkaouyj = 0; hkkaouyj < 0; hkkaouyj++) {double pnmbbrdi = -929522447;}

        return buggyMethod(null);
    
}
}