import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpSession;

class Bug3053867 {

  static class Foo {
    int a;

    public int getA() {
      return a;
    }

    public void setA(int a) {
      this.a = a;
    }
  }

  HttpSession session;

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void setSession(HttpSession s) {
    this.session = s;
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeMap(Map<String, String> m) {
    session.setAttribute("map", m);
  }

  @NoWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeSet(Set<String> se) {
    session.setAttribute("set", se);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFoo(Foo foo) {
    session.setAttribute("foo", foo);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooSet(Set<Foo> fs) {
    session.setAttribute("fooSet", fs);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap1(Map<Foo, String> fm) {
    session.setAttribute("fooMap", fm);
  }

  @ExpectWarning("J2EE_STORE_OF_NON_SERIALIZABLE_OBJECT_INTO_SESSION")
  public void storeFooMap2(Map<String, Foo> fmp) {
    session.setAttribute("fooMap", fmp);
  }
}