import org.junit.Test;
import java.net.URL;

public class CustomClassLoaderExampleTest {

    @Test
    public void testGetPermissionsWithoutCallingSuper() {
        CustomClassLoaderExample example = new CustomClassLoaderExample(new URL[]{});
        example.showBug(); // TRIGGER BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS) 
    }
}