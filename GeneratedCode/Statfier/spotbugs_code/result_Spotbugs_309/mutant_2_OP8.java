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
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooSet(Set<Foo> fooSet) {
    session.setAttribute("fooSet", fooSet);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap1(Map<Foo, String> fooMap) {
    session.setAttribute("fooMap", fooMap);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap2(Map<String, Foo> fooMap) {
    session.setAttribute("fooMap", fooMap);
  }

  // Mutated code
  HttpSession s;

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void setSessionMutant(HttpSession s) {
    this.s = s;
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeMapMutant(Map<String, String> m) {
    s.setAttribute("map", m);
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeSetMutant(Set<String> t) {
    s.setAttribute("set", t);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMutant(Foo f) {
    s.setAttribute("foo", f);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooSetMutant(Set<Foo> fs) {
    s.setAttribute("fooSet", fs);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap1Mutant(Map<Foo, String> fm) {
    s.setAttribute("fooMap", fm);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap2Mutant(Map<String, Foo> fm) {
    s.setAttribute("fooMap", fm);
  }
}