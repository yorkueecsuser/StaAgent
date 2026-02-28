class GetClassAndClassConstant {

  static class A {
    int x;

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        if (o!= null && A.class.equals(o.getClass())) return x == ((A) o).x;
      } else {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          System.out.println("This is an unreachable if statement");
        } else {
          System.out.println("This is an unreachable else statement");
        }
      }
      return false;
    }
  }

  static class B extends A {}

  static class A2 {
    int x;

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && A2.class.equals(o.getClass())) return x == ((A2) o).x;
      return false;
    }
  }

  static class B2 extends A2 {
    @Override
    public boolean equals(Object o) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        if (o!= null && B2.class.equals(o.getClass())) return x == ((B2) o).x;
      } else {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          System.out.println("This is an unreachable if statement in B2");
        } else {
          System.out.println("This is an unreachable else statement in B2");
        }
      }
      return false;
    }
  }

  static class C {
    int x;

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && C.class.equals(o.getClass())) return x == ((C) o).x;
      return false;
    }
  }

  static final class D {
    int x;

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && D.class.equals(o.getClass())) return x == ((D) o).x;
      return false;
    }
  }

  static class E { // OK, this is just stupid, but perhaps we should check for
    // it
    int x;

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        if (o!= null && C.class.equals(o.getClass())) return x == ((C) o).x;
      } else {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          System.out.println("This is an unreachable if statement in E");
        } else {
          System.out.println("This is an unreachable else statement in E");
        }
      }
      return false;
    }
  }

  private static boolean getCondition() {
    return true; // This can be any logic that determines the condition at runtime
  }

  private static boolean getUnreachableCondition() {
    return false; // This condition is always false, making the if-else block unreachable
  }
}