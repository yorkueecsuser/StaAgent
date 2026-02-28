class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        y = new Integer(0);
        break;
      case 1:
        // This case will always be executed
        y = new Integer(1);
        break;
    }
    
    return y.hashCode();
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}