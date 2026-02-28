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

  boolean getCondition() {
    return false;
  }

  String checkA(A x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in checkA");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in checkA");
    }
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(B x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in checkB");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in checkB");
    }
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }

  String checkB(C x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in checkC");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in checkC");
    }
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";
    return "";
  }
}