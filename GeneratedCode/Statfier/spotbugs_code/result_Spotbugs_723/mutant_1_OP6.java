class GetClassAndClassConstant {

  static class A {
    int x;

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
      if (o!= null && A.class.equals(o.getClass())) return x == ((A) o).x;
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
      if (o!= null && A2.class.equals(o.getClass())) return x == ((A2) o).x;
      return false;
    }
  }

  static class B2 extends A2 {
    @Override
    public boolean equals(Object o) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
      if (o!= null && B2.class.equals(o.getClass())) return x == ((B2) o).x;
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
      if (o!= null && C.class.equals(o.getClass())) return x == ((C) o).x;
      return false;
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}