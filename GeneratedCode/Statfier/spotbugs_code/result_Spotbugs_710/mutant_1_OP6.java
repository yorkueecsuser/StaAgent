class Bug1564367 {
  void f(Object x, Object y) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    
    if (y == null) x = y;
    else System.out.println(x);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}