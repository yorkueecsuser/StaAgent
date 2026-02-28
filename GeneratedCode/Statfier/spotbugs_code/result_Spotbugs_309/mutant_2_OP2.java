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
    this.session = session; // Mutant: Duplicate assignment
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeMap(Map<String, String> map) {
    session.setAttribute("map", map);
    session.setAttribute("map", map); // Mutant: Duplicate assignment
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeSet(Set<String> set) {
    session.setAttribute("set", set);
    session.setAttribute("set", set); // Mutant: Duplicate assignment
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFoo(Foo foo) {
    session.setAttribute("foo", foo);
    session.setAttribute("foo", foo); // Mutant: Duplicate assignment
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooSet(Set<Foo> fooSet) {
    session.setAttribute("fooSet", fooSet);
    session.setAttribute("fooSet", fooSet); // Mutant: Duplicate assignment
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap1(Map<Foo, String> fooMap) {
    session.setAttribute("fooMap", fooMap);
    session.setAttribute("fooMap", fooMap); // Mutant: Duplicate assignment
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap2(Map<String, Foo> fooMap) {
    session.setAttribute("fooMap", fooMap);
    session.setAttribute("fooMap", fooMap); // Mutant: Duplicate assignment
  }
}