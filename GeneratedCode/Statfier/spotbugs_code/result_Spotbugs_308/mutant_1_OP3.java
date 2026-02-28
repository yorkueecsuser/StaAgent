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

    // Mutant code: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      pc.add(new RuntimePermission("modifyThread"));
    }

    return pc;
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}