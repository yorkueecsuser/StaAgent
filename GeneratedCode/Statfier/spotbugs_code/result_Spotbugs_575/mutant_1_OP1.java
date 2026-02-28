class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    String qjvhtybn = "unused"; // Dead store
    System.out.println(o.hashCode());
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    int mfrtghjk = 42; // Dead store
    System.out.println(o.hashCode());
    throw new RuntimeException();
  }

  int doomed2(Object x) {
    double zxcvbnml = 3.14; // Dead store
    if (x == null) System.out.println("null");
    int result = x.hashCode();
    throw new RuntimeException("F" + result);
  }
}