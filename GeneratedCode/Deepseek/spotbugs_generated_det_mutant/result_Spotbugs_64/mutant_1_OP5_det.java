import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
int uxhxrphl = 0;switch  (uxhxrphl) {case 1:char scvvjzna = 'z';break;default:float vwkxhnmr = 114643521;break;}

        return buggyMethod(null);
    
}
}