class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());
    throw new RuntimeException();

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    int result = x.hashCode();
    throw new RuntimeException("F" + result);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}