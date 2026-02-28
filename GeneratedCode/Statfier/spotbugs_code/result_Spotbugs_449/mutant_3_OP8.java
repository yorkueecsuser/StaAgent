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

  // Mutant 1: Renamed 'o' to 'a'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public static String getName_a(Parent a) {
    String t;

    if (a instanceof Child) t = (String) ((Child) a).getValue();
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

  // Mutant 2: Renamed '_p' to 'b'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2_b(Parent o) {
    Parent b = o;
    String s;

    if (b instanceof Child) s = (String) ((Child) b).getValue();
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

  // Mutant 3: Renamed 'o1' to 'c'
  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName3_c(Parent c, Parent o2) {

    _p = c;
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

  // Mutant 4: Renamed 'o2' to 'd'
  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public String getName4_d(Parent o1, Parent d) {

    _p = o1;
    String s;

    if (d instanceof Child) s = (String) ((Child) _p).getValue();
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

  // Mutant 5: Renamed 'o1' to 'e'
  @ExpectWarning("BC_UNCONFIRMED_CAST")
  public static String getName2_e(Parent e, Parent o2) {
    String f;

    if (e instanceof Child) f = (String) ((Child) o2).getValue();
    else f = "<anonymous>";

    return f;
  }

  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName() {

    String s;

    if (_p instanceof Child) s = (String) ((Child) _p).getValue();
    else s = "<anonymous>";

    return s;
  }

  // Mutant 6: Renamed '_p' to 'g'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName_g() {

    Parent g = _p;
    String s;

    if (g instanceof Child) s = (String) ((Child) g).getValue();
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

  // Mutant 7: Renamed 'p' to 'h'
  @NoWarning("BC_UNCONFIRMED_CAST")
  public String getName2_h() {

    Parent h = _p;
    String i;

    if (h instanceof Child) i = (String) ((Child) h).getValue();
    else i = "<anonymous>";

    return i;
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

  // Mutant 8: Renamed '_p' to 'j'
  static class Original_j {
    private Parent j;
    String _s;

    @NoWarning("BC_UNCONFIRMED_CAST")
    public Original_j(Parent o) {
      j = o;

      if (j instanceof Child) _s = (String) ((Child) j).getValue();
      else _s = "<anonymous>";
    }
  }
}