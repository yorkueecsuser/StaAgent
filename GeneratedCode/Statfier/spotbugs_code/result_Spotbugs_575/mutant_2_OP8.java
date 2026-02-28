class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());
    
    // Mutant
    Object a = null;
    if (b) {
      a = new Object();
    }
    System.out.println(a.hashCode());
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());
    throw new RuntimeException();
    
    // Mutant
    Object c = null;
    if (b) {
      c = new Object();
    }
    System.out.println(c.hashCode());
    throw new RuntimeException();
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    int result = x.hashCode();
    throw new RuntimeException("F" + result);
    
    // Mutant
    int y = 0;
    if (x == null) System.out.println("null");
    y = x.hashCode();
    throw new RuntimeException("F" + y);
  }
}