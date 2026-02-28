class UseCheckUse {
  final Object x;

  UseCheckUse(Object x) {
    this.x = x;
  }

  int f(boolean b) {
    int result = x.hashCode();
    if (x == null) {
      System.out.println("x is null");
    }
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
    
    if (b) result *= x.hashCode();
    else result += x.hashCode();
    return result;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is false at runtime, making the loop unreachable
  }
}