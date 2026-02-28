import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class RE_POSSIBLE_UNINTENDED_PATTERN {

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug1(String any) {
    return any.split(".");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug2(String any, String any2) {
    return any.replaceAll(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug3(String any, String any2) {
    return any.replaceFirst(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug11(String any) {
    return any.split("|");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug22(String any, String any2) {
    return any.replaceAll("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug33(String any, String any2) {
    return any.replaceFirst("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug4(String any) {
    return any.replaceAll("|", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String notBug1(String any) {
    return any.replaceAll(".", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug2(String any) {
    return any.indexOf(".");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug22(String any) {
    return any.indexOf("|");
  }

  // Mutated methods
  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug1a(String b) {
    return b.split(".");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug2a(String c, String d) {
    return c.replaceAll(".", d);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug3a(String e, String f) {
    return e.replaceFirst(".", f);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug11a(String g) {
    return g.split("|");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug22a(String h, String i) {
    return h.replaceAll("|", i);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug33a(String j, String k) {
    return j.replaceFirst("|", k);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug4a(String l) {
    return l.replaceAll("|", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String notBug1a(String m) {
    return m.replaceAll(".", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug2a(String n) {
    return n.indexOf(".");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug22a(String o) {
    return o.indexOf("|");
  }
}