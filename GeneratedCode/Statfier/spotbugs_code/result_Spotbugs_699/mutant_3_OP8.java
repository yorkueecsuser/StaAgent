class Bug1723940 {

  Bug1723940 child;

  Bug1723940 getChild() {
    return child;
  }

  public static void doX(Bug1723940 o) {
    o.hashCode();
    while (o!= null) {
      o = o.getChild();
    }
  }

  // Mutated code
  Bug1723940 b;

  Bug1723940 getB() {
    return b;
  }

  public static void doY(Bug1723940 a) {
    a.hashCode();
    while (a!= null) {
      a = a.getB();
    }
  }
}