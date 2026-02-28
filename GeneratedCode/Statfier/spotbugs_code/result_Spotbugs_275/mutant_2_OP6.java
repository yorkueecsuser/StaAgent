class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }
    
    // Inserting an unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    
    return y.hashCode();
  }

  private boolean getConditionForLoop() {
    return false;
  }
}