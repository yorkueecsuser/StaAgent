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

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      pc.add(new RuntimePermission("createClassLoader"));
    }

    return pc;
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}