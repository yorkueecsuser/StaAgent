class Bug1564367 {
  void f(Object x, Object y) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    
    if (y == null) x = y;
    else System.out.println(x);
  }

  private boolean getCondition() {
    return false;
  }
}