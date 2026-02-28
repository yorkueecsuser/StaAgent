class NullDeref11 {

  int foo(Object o) {
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case");
        break;
    }
    
    if (o!= null & o.hashCode() == 42) return 1;
    return 0;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}