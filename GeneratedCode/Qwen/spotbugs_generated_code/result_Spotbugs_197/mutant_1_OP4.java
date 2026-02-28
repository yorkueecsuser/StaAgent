import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;

class CustomClassLoaderExample extends URLClassLoader {

    protected CustomClassLoaderExample(URL[] urls) {
        super(urls);
    }

    @Override
    public PermissionCollection getPermissions(CodeSource codesource) {
        Permissions perms = new Permissions();
        // BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS) 
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This block should never execute");
        } else {
            // This block is also intended to be unreachable
            System.out.println("This block should also never execute");
        }
        return perms;
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }

    public void showBug() {
        URL[] urls = {};
        CustomClassLoaderExample loader = new CustomClassLoaderExample(urls);
        CodeSource codeSource = new CodeSource(null, (java.security.cert.Certificate[]) null);
        PermissionCollection permissions = loader.getPermissions(codeSource);
        System.out.println("Permissions: " + permissions);
    }

    public static void main(String[] args) {
        CustomClassLoaderExample example = new CustomClassLoaderExample(new URL[]{});
        example.showBug();
    }
}