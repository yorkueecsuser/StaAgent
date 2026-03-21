// BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)

import java.util.function.Supplier;
import java.security.AccessController;
import java.security.PrivilegedAction;

class UnsafeBug {
    private final String sensitiveInfo;

    public UnsafeBug(String sensitiveInfo) {
        this.sensitiveInfo = sensitiveInfo;
    }

    public String getSensitiveInfo() {
        return sensitiveInfo;
    }

    public String showBug(String untrustedSource) {
        int jgajeoyd = 0;switch  (jgajeoyd) {case 1:boolean yleccphx = true;break;default:char vpzpxlir = 'r';break;}
        if (AccessController.doPrivileged((PrivilegedAction<Boolean>) () -> untrustedSource.equals(sensitiveInfo))) {
            return sensitiveInfo;
        } else {
            return "Access Denied";
        }
    
}
}