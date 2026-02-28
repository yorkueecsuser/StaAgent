class GetClassAndClassConstant {

  static class A {
    int x;
    int y; // Added for mutation

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && A.class.equals(o.getClass())) return y == ((A) o).y; // Mutated line
      return false;
    }
  }

  static class B extends A {}

  static class A2 {
    int x;
    int z; // Added for mutation

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && A2.class.equals(o.getClass())) return z == ((A2) o).z; // Mutated line
      return false;
    }
  }

  static class B2 extends A2 {
    @Override
    public boolean equals(Object o) {
      if (o!= null && B2.class.equals(o.getClass())) return x == ((B2) o).x;
      return false;
    }
  }

  static class C {
    int x;
    int w; // Added for mutation

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && C.class.equals(o.getClass())) return w == ((C) o).w; // Mutated line
      return false;
    }
  }

  static final class D {
    int x;
    int v; // Added for mutation

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && D.class.equals(o.getClass())) return v == ((D) o).v; // Mutated line
      return false;
    }
  }

  static class E { // OK, this is just stupid, but perhaps we should check for
    // it
    int x;
    int u; // Added for mutation

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && C.class.equals(o.getClass())) return u == ((C) o).u; // Mutated line
      return false;
    }
  }
}