import java.security.PermissionCollection;
import java.security.CodeSource;
import java.security.Policy;
import java.security.Permissions;

// Custom class loader that demonstrates the bug
class CustomClassLoader extends ClassLoader {

    // This method incorrectly does not override a superclass method
protected PermissionCollection getPermissions(CodeSource codesource){
    Permissions permissions = new Permissions();
    permissions = new Permissions();
    return permissions;
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