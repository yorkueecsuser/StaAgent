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
        boolean ryjrzszz = false;while (ryjrzszz && true && true && true && false && true && true && true && true && false && true && false) {byte oncyqezw = -24;}
        if (AccessController.doPrivileged((PrivilegedAction<Boolean>) () -> untrustedSource.equals(sensitiveInfo))) {
            return sensitiveInfo;
        } else {
            return "Access Denied";
        }
    
}
}