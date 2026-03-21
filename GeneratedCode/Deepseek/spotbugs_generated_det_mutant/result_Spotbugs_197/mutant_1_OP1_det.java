import java.security.*;
import java.net.URL;
import java.net.URLClassLoader;

class MyClassLoader extends URLClassLoader {
    public MyClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    // BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS)
    @Override
    public PermissionCollection getPermissions(CodeSource codesource) {
float rkdvmjvr = 147812252;

        return super.getPermissions(codesource);
    
}

    public static void main(String[] args) throws Exception {
        URL[] urls = {new URL("file:///tmp/test/")};
        MyClassLoader classLoader = new MyClassLoader(urls, MyClassLoader.class.getClassLoader());
        Class<?> myClass = classLoader.loadClass("MyClass");
        myClass.newInstance();
    }
}