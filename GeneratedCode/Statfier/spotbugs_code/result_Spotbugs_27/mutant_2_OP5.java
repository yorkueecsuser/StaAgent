class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        count += 100;
        break;
      case 1:
        // This case is always executed
        count += 1;
        break;
    }

    System.out.println(count);
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}