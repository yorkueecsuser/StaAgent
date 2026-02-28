import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpSession;

class Bug3053867 {

  static class Foo {
    int x;

    public int getX() {
      return x;
    }

    public void setX(int x) {
      this.x = x;
    }
  }

  HttpSession session;

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void setSession(HttpSession session) {
    this.session = session;
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeMap(Map<String, String> map) {
    session.setAttribute("map", map);
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeSet(Set<String> set) {
    session.setAttribute("set", set);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFoo(Foo foo) {
    session.setAttribute("foo", foo);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooSet(Set<Foo> fooSet) {
    session.setAttribute("fooSet", fooSet);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap1(Map<Foo, String> fooMap) {
    session.setAttribute("fooMap", fooMap);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap2(Map<String, Foo> fooMap) {
    session.setAttribute("fooMap", fooMap);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}