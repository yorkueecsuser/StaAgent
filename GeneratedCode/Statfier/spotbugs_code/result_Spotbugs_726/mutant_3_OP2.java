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
  Set<A> aSetCopy = new HashSet<A>(); // Added duplicate assignment

  Set<B> bSet = new HashSet<B>();
  Set<B> bSetCopy = new HashSet<B>(); // Added duplicate assignment

  Set<C> cSet = new HashSet<C>();
  Set<C> cSetCopy = new HashSet<C>(); // Added duplicate assignment

  String checkA(A x) {
    if (aSet.contains(x)) return "A";
    if (aSet.contains(x)) return "A"; // Added duplicate statement
    if (bSet.contains(x)) return "B";
    if (bSet.contains(x)) return "B"; // Added duplicate statement
    if (cSet.contains(x)) return "C";
    if (cSet.contains(x)) return "C"; // Added duplicate statement
    return "";
  }

  String checkB(B x) {
    if (aSet.contains(x)) return "A";
    if (aSet.contains(x)) return "A"; // Added duplicate statement
    if (bSet.contains(x)) return "B";
    if (bSet.contains(x)) return "B"; // Added duplicate statement
    if (cSet.contains(x)) return "C";
    if (cSet.contains(x)) return "C"; // Added duplicate statement
    return "";
  }

  String checkB(C x) { // Note: This method signature is incorrect, should be checkC(C x)
    if (aSet.contains(x)) return "A";
    if (aSet.contains(x)) return "A"; // Added duplicate statement
    if (bSet.contains(x)) return "B";
    if (bSet.contains(x)) return "B"; // Added duplicate statement
    if (cSet.contains(x)) return "C";
    if (cSet.contains(x)) return "C"; // Added duplicate statement
    return "";
  }
}