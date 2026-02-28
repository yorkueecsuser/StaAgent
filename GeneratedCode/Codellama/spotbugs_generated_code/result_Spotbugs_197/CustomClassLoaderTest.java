import org.junit.Test;
import static org.junit.Assert.*;

public class CustomClassLoaderTest {
    private ClassLoader loader;
    
    @Before
    public void setUp() {
        loader = new CustomClassLoader();
    }

    @After
    public void tearDown() {
        loader = null;
    }

    @Test
    public void testGetPermissions() {
        // TRIGGER BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS)
        CodeSource codesource = null;
        PermissionCollection permissions = loader.getPermissions(codesource);
        assertNotNull(permissions);

        permissions.add(new RuntimePermission("customPermission"));
        assertEquals(1, permissions.size());
    }
}