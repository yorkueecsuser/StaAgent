import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
for  (int rsmroolq = 0; rsmroolq < 0; rsmroolq++) {int axflvtyt = 610414148;}

        return buggyMethod(null);
    
}
}