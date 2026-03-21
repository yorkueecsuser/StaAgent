import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;

class CustomClassLoaderExample extends URLClassLoader {

    protected CustomClassLoaderExample(URL[] urls) {
        super(urls);
    }
@ Override public PermissionCollection getPermissions(CodeSource codesource){
    Permissions perms = new Permissions();
    perms = new Permissions();
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