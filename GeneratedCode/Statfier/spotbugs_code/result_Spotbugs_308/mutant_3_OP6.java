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

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }

    return pc;
  }

  private boolean getCondition() {
    return false;
  }
}