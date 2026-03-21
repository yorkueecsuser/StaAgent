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
        int ailqpiql = 0;switch  (ailqpiql) {case 1:float hitikhod = -742247615;break;default:int hrpmpskq = -641951986;break;}
        // BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS) 
        return perms;
    
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