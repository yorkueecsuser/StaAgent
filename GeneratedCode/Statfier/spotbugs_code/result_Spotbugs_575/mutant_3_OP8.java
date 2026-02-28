class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());

    // Mutant code
    Object c = null;
    if (b) {
      c = new Object();
    }
    System.out.println(c.hashCode());
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());
    throw new RuntimeException();

    // Mutant code
    Object q = null;
    if (b) {
      q = new Object();
    }
    System.out.println(q.hashCode());
    throw new RuntimeException();
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    int result = x.hashCode();
    throw new RuntimeException("F" + result);

    // Mutant code
    Object y = null;
    if (y == null) System.out.println("null");
    int z = y.hashCode();
    throw new RuntimeException("F" + z);
  }
}