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
  Set<A> aSetCopy = new HashSet<A>(); // Duplicate assignment

  Set<B> bSet = new HashSet<B>();
  Set<B> bSetCopy = new HashSet<B>(); // Duplicate assignment

  Set<C> cSet = new HashSet<C>();
  Set<C> cSetCopy = new HashSet<C>(); // Duplicate assignment

  String checkA(A x) {
    if (aSet.contains(x)) return "A";
    if (aSet.contains(x)) return "A"; // Duplicate assignment
    if (bSet.contains(x)) return "B";
    if (bSet.contains(x)) return "B"; // Duplicate assignment
    if (cSet.contains(x)) return "C";
    if (cSet.contains(x)) return "C"; // Duplicate assignment
    return "";
  }

  String checkB(B x) {
    if (aSet.contains(x)) return "A";
    if (aSet.contains(x)) return "A"; // Duplicate assignment
    if (bSet.contains(x)) return "B";
    if (bSet.contains(x)) return "B"; // Duplicate assignment
    if (cSet.contains(x)) return "C";
    if (cSet.contains(x)) return "C"; // Duplicate assignment
    return "";
  }

  String checkB(C x) {
    if (aSet.contains(x)) return "A";
    if (aSet.contains(x)) return "A"; // Duplicate assignment
    if (bSet.contains(x)) return "B";
    if (bSet.contains(x)) return "B"; // Duplicate assignment
    if (cSet.contains(x)) return "C";
    if (cSet.contains(x)) return "C"; // Duplicate assignment
    return "";
  }
}