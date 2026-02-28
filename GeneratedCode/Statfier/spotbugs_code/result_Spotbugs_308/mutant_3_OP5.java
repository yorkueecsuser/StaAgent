import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;

class PermissionsSuperTest extends URLClassLoader {
  PermissionsSuperTest(URL[] urls) {
    super(urls);
  }

  @ExpectWarning("PERM")
  protected PermissionCollection getPermissions(CodeSource cs) {
    PermissionCollection pc = new Permissions();
    pc.add(new RuntimePermission("exitVM"));

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be executed because condition is not set to true
        pc.add(new RuntimePermission("dummyPermission"));
        break;
      default:
        // Default case to ensure the switch is not empty and condition is always false
        break;
    }

    return pc;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}