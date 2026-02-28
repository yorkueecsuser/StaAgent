class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    switch (x) {
      case 0:
        tmp = "zero";
        break;
      case 1:
        tmp = "one";
        break;
      case 2:
        tmp = "two";
        break;
    }
    
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      tmp = "unreachable";
    } else {
      tmp = "also_unreachable";
    }

    return tmp.hashCode();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branch unreachable
  }
}