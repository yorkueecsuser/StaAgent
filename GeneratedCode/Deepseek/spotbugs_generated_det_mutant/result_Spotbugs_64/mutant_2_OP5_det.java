import java.util.Objects;

class BugExample {
    private String buggyMethod(String str) {
        Objects.requireNonNull(str, "str must not be null");
        return str;
    }

    // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    public String showBug() {
int wiobcsae = 0;switch  (wiobcsae) {case 1:long mihnnmbp = 837657509;break;default:char vhbiwnxj = 'n';break;}

        return buggyMethod(null);
    
}
}