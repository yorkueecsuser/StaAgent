class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
      o = new Object(); // Mutant: duplicated assignment
    }
    System.out.println(o.hashCode());
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
      o = new Object(); // Mutant: duplicated assignment
    }
    System.out.println(o.hashCode());
    throw new RuntimeException();
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    int result = x.hashCode();
    result = x.hashCode(); // Mutant: duplicated assignment
    throw new RuntimeException("F" + result);
  }
}