class Bug1723940 {

  Bug1723940 child;

  Bug1723940 getChild() {
    return child;
  }

  public static void doX(Bug1723940 o) {
    o.hashCode();
    while (o!= null) {
      // Introducing an unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This will never be printed");
          break;
        default:
          System.out.println("This will also never be printed");
          break;
      }
      o = o.getChild();
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}