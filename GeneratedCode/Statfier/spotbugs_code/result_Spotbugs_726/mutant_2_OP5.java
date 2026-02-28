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
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        System.out.println("This is unreachable");
        break;
    }

    return "";
  }

  String checkB(B x) {
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        System.out.println("This is unreachable");
        break;
    }

    return "";
  }

  String checkB(C x) {
    if (aSet.contains(x)) return "A";
    if (bSet.contains(x)) return "B";
    if (cSet.contains(x)) return "C";

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        System.out.println("This is unreachable");
        break;
    }

    return "";
  }
}