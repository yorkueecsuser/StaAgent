import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3479234 {
  private Parent _p;

  public void setParent(Parent p) {
    _p = p;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public static String getName(Parent o) {
    String s;

    if (o instanceof Child) s = (String) ((Child) o).getValue();
    else s = "<anonymous>";

    return s;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2(Parent o) {
    _p = o;
    String s;

    if (_p instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName3(Parent o1, Parent o2) {

    _p = o1;
    String s;

    if (_p instanceof Child) s = (String) ((Child) o2).getValue();
    else s = "<anonymous>";

    return s;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName4(Parent o1, Parent o2) {

    _p = o1;
    String s;

    if (o2 instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public static String getName2(Parent o1, Parent o2) {
    String s;

    if (o1 instanceof Child) s = (String) ((Child) o2).getValue();
    else s = "<anonymous>";

    return s;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName() {

    String s;

    if (_p instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2() {

    Parent p = _p;
    String s;

    if (p instanceof Child) s = (String) ((Child) p).getValue();
    else s = "<anonymous>";

    return s;
  }

  // Mutated code starts here

  @NoWarning("BC_UNCONFIRMED_CAST")
  public static String getNamen(Parent x) {
    String t;

    if (x instanceof Child) t = (String) ((Child) x).getValue();
    else t = "<anonymous>";

    return t;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2n(Parent x) {
    _p = x;
    String t;

    if (_p instanceof Child) t = (String) ((Child) _p).getValue();
    else t = "<anonymous>";

    return t;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName3n(Parent x1, Parent x2) {

    _p = x1;
    String t;

    if (_p instanceof Child) t = (String) ((Child) x2).getValue();
    else t = "<anonymous>";

    return t;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName4n(Parent x1, Parent x2) {

    _p = x1;
    String t;

    if (x2 instanceof Child) t = (String) ((Child) _p).getValue();
    else t = "<anonymous>";

    return t;
  }

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public static String getName2n(Parent x1, Parent x2) {
    String t;

    if (x1 instanceof Child) t = (String) ((Child) x2).getValue();
    else t = "<anonymous>";

    return t;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getNamen() {

    String t;

    if (_p instanceof Child) t = (String) ((Child) _p).getValue();
    else t = "<anonymous>";

    return t;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2n() {

    Parent q = _p;
    String t;

    if (q instanceof Child) t = (String) ((Child) q).getValue();
    else t = "<anonymous>";

    return t;
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

      if (_p instanceof Child) _s = (String) ((Child) _p).getValue();
      else _s = "<anonymous>";
    }
  }
}