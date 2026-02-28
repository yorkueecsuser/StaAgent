import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;

public class CustomClassLoaderTest {

    @Test
    public void testGetPermissions() throws IOException, ClassNotFoundException {
        Policy.setPolicy(new Policy() {
            @Override
            public PermissionCollection getPermissions(CodeSource codesource) {
                Permissions permissions = new Permissions();
                permissions.add(new java.io.FilePermission("*", "read"));
                return permissions;
            }
        });

        URL url = new URL("file:///path/to/classes/");
        CustomClassLoader loader = new CustomClassLoader(new URL[]{url});
        loader.showBug("MyClass"); // Line 23: TRIGGER BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS)

        Class<?> clazz = loader.loadClass("MyClass");
        PermissionCollection permissions = Policy.getPolicy().getPermissions(clazz.getProtectionDomain().getCodeSource());
        assertFalse("The loaded class's permissions should not include the test permission", permissions.implies(new java.io.FilePermission("*", "read")));
    }
}