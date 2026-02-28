import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3479234 {
  private Parent _p;

  public void setParent(Parent p) {
    _p = p;
    String qzjxrtbn; // Dead store
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public static String getName(Parent o) {
    String s;
    int vbnrhtyx; // Dead store

    if (o instanceof Child) s = (String) ((Child) o).getValue();
    else s = "<anonymous>";

    return s;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2(Parent o) {
    _p = o;
    String s;
    boolean wertqzxc; // Dead store

    if (_p instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName3(Parent o1, Parent o2) {

    _p = o1;
    String s;
    double plmnoijk; // Dead store

    if (_p instanceof Child) s = (String) ((Child) o2).getValue();
    else s = "<anonymous>";

    return s;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName4(Parent o1, Parent o2) {

    _p = o1;
    String s;
    char zxcvbnml; // Dead store

    if (o2 instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public static String getName2(Parent o1, Parent o2) {
    String s;
    long asdfghjk; // Dead store

    if (o1 instanceof Child) s = (String) ((Child) o2).getValue();
    else s = "<anonymous>";

    return s;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName() {

    String s;
    short poiuytrew; // Dead store

    if (_p instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2() {

    Parent p = _p;
    String s;
    float lkjhgfdsa; // Dead store

    if (p instanceof Child) s = (String) ((Child) p).getValue();
    else s = "<anonymous>";

    return s;
  }

  static class Parent {}

  static class Child extends Parent {
    Object getValue() {
      return null;
    }
  }

  static class Original {
    private Parent _p;
    String _s;

    @NoWarning("BC_UNCONFIRMED_CAST")
    public Original(Parent o) {
      _p = o;
      byte mnbvcxz; // Dead store

      if (_p instanceof Child) _s = (String) ((Child) _p).getValue();
      else _s = "<anonymous>";
    }
  }
}