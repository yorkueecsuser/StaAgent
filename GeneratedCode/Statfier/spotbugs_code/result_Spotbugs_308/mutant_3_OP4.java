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

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed
      pc.add(new RuntimePermission("createSecurityManager"));
    } else {
      // This block will always be executed
      pc.add(new RuntimePermission("setSecurityManager"));
    }

    return pc;
  }

  private boolean getCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}