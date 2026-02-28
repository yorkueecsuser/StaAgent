class CorrectlyLocalizeWarning {

  int f(int x) {
    String s = null;
    boolean conditionFor = getCondition();
    
    if (x == 1) {
      s = "1";
      // Unreachable for loop
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    }
    else if (x == 2) throw new IllegalArgumentException();
    else if (x == 3) {
      System.out.println("Impossible");
      // Unreachable for loop
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    } else if (x == 4) {
      s = "4";
      // Unreachable for loop
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    } else if (x == 5) {
      s = "5";
      // Unreachable for loop
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    } else throw new IllegalArgumentException();

    return s.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}