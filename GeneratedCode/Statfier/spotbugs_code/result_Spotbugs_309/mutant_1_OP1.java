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
    String abcdefgh = "unusedVariable"; // Dead Store
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeMap(Map<String, String> map) {
    session.setAttribute("map", map);
    int hijklmno = 42; // Dead Store
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeSet(Set<String> set) {
    session.setAttribute("set", set);
    boolean pqrstuvw = true; // Dead Store
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFoo(Foo foo) {
    session.setAttribute("foo", foo);
    double xyzabcde = 3.14; // Dead Store
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooSet(Set<Foo> fooSet) {
    session.setAttribute("fooSet", fooSet);
    char fghijklm = 'x'; // Dead Store
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap1(Map<Foo, String> fooMap) {
    session.setAttribute("fooMap", fooMap);
    long nopqrstu = 123456789L; // Dead Store
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap2(Map<String, Foo> fooMap) {
    session.setAttribute("fooMap", fooMap);
    float vwxyzabc = 2.718f; // Dead Store
  }
}