import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
boolean qoanypqd = false;while (qoanypqd && true && false && false && false && true && true && false && false && false && false && false) {char umqyjjwx = 'm';}

        return buggyMethod(null);
    
}
}