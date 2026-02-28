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

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        pc.add(new RuntimePermission("createSecurityManager"));
        break;
      default:
        // Default case will also never be executed due to alwaysFalse being false
        pc.add(new RuntimePermission("setSecurityManager"));
        break;
    }

    return pc;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}