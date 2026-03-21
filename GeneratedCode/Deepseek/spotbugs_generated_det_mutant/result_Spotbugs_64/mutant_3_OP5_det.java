import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
int njxsdkav = 0;switch  (njxsdkav) {case 1:double frllutvv = 115780941;break;default:boolean neyyytfe = false;break;}

        return buggyMethod(null);
    
}
}