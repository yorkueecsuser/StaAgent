import java.util.HashSet;
import java.util.Set;

class WeirdEquals {

  static class A {
    int id;

    @Override
    public int hashCode() {
      return id;
    }

    @Override
    public boolean equals(Object o) {
      if (o instanceof A) return id == ((A) o).id;
      return false;
    }
  }

  static class B {
    int id;

    @Override
    public int hashCode() {
      return id;
    }

    @Override
    public boolean equals(Object o) {
      if (o instanceof A) return id == ((A) o).id;
      if (o instanceof B) return id == ((B) o).id;
      if (o instanceof C) return id == ((C) o).id;
      return false;
    }
  }

  static class C {
    int id;

    @Override
    public int hashCode() {
      return id;
    }

    @Override
    public boolean equals(Object o) {
      if (o instanceof B) return id == ((B) o).id;
      if (o instanceof C) return id == ((C) o).id;
      return false;
    }
  }

  Set<A> aSet = new HashSet<A>();
  Set<A> q = new HashSet<A>(); // Mutant: Renamed 'aSet' to 'q'

  Set<B> bSet = new HashSet<B>();
  Set<B> r = new HashSet<B>(); // Mutant: Renamed 'bSet' to 'r'

  Set<C> cSet = new HashSet<C>();
  Set<C> s = new HashSet<C>(); // Mutant: Renamed 'cSet' to's'

  String checkA(A x) {
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkA(A y) { // Mutant: Added new method with renamed parameter
    if (q.contains(y)) return "A";
    if (r.contains(y)) return "B";
    if (s.contains(y)) return "C";
    return "";
  }

  String checkB(B x) {
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(B y) { // Mutant: Added new method with renamed parameter
    if (q.contains(y)) return "A";
    if (r.contains(y)) return "B";
    if (s.contains(y)) return "C";
    return "";
  }

  String checkB(C x) {
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(C y) { // Mutant: Added new method with renamed parameter
    if (q.contains(y)) return "A";
    if (r.contains(y)) return "B";
    if (s.contains(y)) return "C";
    return "";
  }
}