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

  Set<B> bSet = new HashSet<B>();

  Set<C> cSet = new HashSet<C>();

  String checkA(A x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      conditionWhile = false; // Ensure the loop is not infinite
    }
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(B x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      conditionWhile = false; // Ensure the loop is not infinite
    }
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(C x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      conditionWhile = false; // Ensure the loop is not infinite
    }
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}