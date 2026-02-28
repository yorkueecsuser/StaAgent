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

  // Mutant: Renamed 'o' to 'x'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public static String getName_m1(Parent x) {
    String t;

    if (x instanceof Child) t = (String) ((Child) x).getValue();
    else t = "<anonymous>";

    return t;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2(Parent o) {
    _p = o;
    String s;

    if (_p instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  // Mutant: Renamed '_p' to 'q'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2_m1(Parent o) {
    Parent q = o;
    String s;

    if (q instanceof Child) s = (String) ((Child) q).getValue();
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

  // Mutant: Renamed 'o2' to 'r'
  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName3_m1(Parent o1, Parent r) {

    _p = o1;
    String s;

    if (_p instanceof Child) s = (String) ((Child) r).getValue();
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

  // Mutant: Renamed 'o1' to 'u'
  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName4_m1(Parent u, Parent o2) {

    _p = u;
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

  // Mutant: Renamed 'o1' to 'v'
  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public static String getName2_m1(Parent v, Parent o2) {
    String w;

    if (v instanceof Child) w = (String) ((Child) o2).getValue();
    else w = "<anonymous>";

    return w;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName() {

    String s;

    if (_p instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  // Mutant: Renamed's' to 'y'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName_m2() {

    String y;

    if (_p instanceof Child) y = (String) ((Child) _p).getValue();
    else y = "<anonymous>";

    return y;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2() {

    Parent p = _p;
    String s;

    if (p instanceof Child) s = (String) ((Child) p).getValue();
    else s = "<anonymous>";

    return s;
  }

  // Mutant: Renamed 'p' to 'z'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2_m2() {

    Parent z = _p;
    String s;

    if (z instanceof Child) s = (String) ((Child) z).getValue();
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

      if (_p instanceof Child) _s = (String) ((Child) _p).getValue();
      else _s = "<anonymous>";
    }
  }

  // Mutant: Renamed '_s' to 'a'
  static class Original_m1 {
    private Parent _p;
    String a;

    @NoWarning("BC_UNCONFIRMED_CAST")
    public Original_m1(Parent o) {
      _p = o;

      if (_p instanceof Child) a = (String) ((Child) _p).getValue();
      else a = "<anonymous>";
    }
  }
}