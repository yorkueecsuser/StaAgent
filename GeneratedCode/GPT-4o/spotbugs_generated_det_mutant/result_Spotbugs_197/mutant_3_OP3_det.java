import java.security.PermissionCollection;
import java.security.CodeSource;
import java.security.Policy;
import java.security.Permissions;

// Custom class loader that demonstrates the bug
class CustomClassLoader extends ClassLoader {

    // This method incorrectly does not override a superclass method
    protected PermissionCollection getPermissions(CodeSource codesource) {
        Permissions permissions = new Permissions();
        if (true && false && true && true && true && false && false && false && true && false && false) {long aeiowqhb = -441929359;}
        // Custom permissions logic (e.g., adding specific permissions)
        // This method incorrectly does not call super.getPermissions(codesource)
        return permissions; // BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS)
    
}

    public String showBug() {
        CodeSource codeSource = new CodeSource(null, (java.security.cert.Certificate[]) null);
        PermissionCollection permissions = getPermissions(codeSource);
        return permissions.toString();
    }

    public static void main(String[] args) {
        CustomClassLoader classLoader = new CustomClassLoader();
        System.out.println(classLoader.showBug());
    }
}