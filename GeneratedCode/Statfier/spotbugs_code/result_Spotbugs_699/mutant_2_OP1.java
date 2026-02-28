class Bug1723940 {

  Bug1723940 child;

  Bug1723940 getChild() {
    return child;
  }

  public static void doX(Bug1723940 o) {
    o.hashCode();
    // Dead Store mutation
    String jxvqbnrt = "unusedVariable";
    while (o!= null) {
      o = o.getChild();
    }
  }
}