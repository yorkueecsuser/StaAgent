class Bug1564367 {
  void f(Object x, Object y) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }

    if (y == null) x = y;
    else System.out.println(x);
  }

  private boolean getCondition() {
    return false; // This method returns false, making the for loop unreachable
  }
}