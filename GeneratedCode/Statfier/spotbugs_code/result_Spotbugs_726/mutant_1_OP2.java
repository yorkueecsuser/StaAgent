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
  Set<A> aSetCopy = new HashSet<A>(); // Duplicated assignment

  Set<B> bSet = new HashSet<B>();
  Set<B> bSetCopy = new HashSet<B>(); // Duplicated assignment

  Set<C> cSet = new HashSet<C>();
  Set<C> cSetCopy = new HashSet<C>(); // Duplicated assignment

  String checkA(A x) {
    if (aSet.contains(x)) return "A";
    if (aSet.contains(x)) return "A"; // Duplicated condition
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(B x) {
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (bSet.contains(x)) return "B"; // Duplicated condition
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(C x) { // Note: This method signature seems incorrect, should be checkC(C x)
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    if (cSet.contains(x)) return "C"; // Duplicated condition
    return "";
  }
}