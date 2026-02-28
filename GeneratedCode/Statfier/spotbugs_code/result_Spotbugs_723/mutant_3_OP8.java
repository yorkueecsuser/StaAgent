class GetClassAndClassConstant {

  static class A {
    int x;

    @Override
    public int hashCode() {
      return x;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && A.class.equals(o.getClass())) return x == ((A) o).x;
      return false;
    }
  }

  static class B extends A {}

  static class A2 {
    int y; // Mutated variable

    @Override
    public int hashCode() {
      return y;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && A2.class.equals(o.getClass())) return y == ((A2) o).y;
      return false;
    }
  }

  static class B2 extends A2 {
    @Override
    public boolean equals(Object o) {
      if (o!= null && B2.class.equals(o.getClass())) return y == ((B2) o).y;
      return false;
    }
  }

  static class C {
    int z; // Mutated variable

    @Override
    public int hashCode() {
      return z;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && C.class.equals(o.getClass())) return z == ((C) o).z;
      return false;
    }
  }

  static final class D {
    int w; // Mutated variable

    @Override
    public int hashCode() {
      return w;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && D.class.equals(o.getClass())) return w == ((D) o).w;
      return false;
    }
  }

  static class E { // OK, this is just stupid, but perhaps we should check for
    // it
    int v; // Mutated variable

    @Override
    public int hashCode() {
      return v;
    }

    @Override
    public boolean equals(Object o) {
      if (o!= null && C.class.equals(o.getClass())) return v == ((C) o).z;
      return false;
    }
  }
}