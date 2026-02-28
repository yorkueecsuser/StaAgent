class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    String qwejklmn = "unused"; // Dead store
    System.out.println(o.hashCode());
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    int asdfghjk = 42; // Dead store
    System.out.println(o.hashCode());
    throw new RuntimeException();
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    double zxcvbnml = 3.14; // Dead store
    int result = x.hashCode();
    throw new RuntimeException("F" + result);
  }
}