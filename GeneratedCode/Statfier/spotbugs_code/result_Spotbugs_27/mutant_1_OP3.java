class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      count += 100;
    }

    System.out.println(count);
  }

  // Method to provide a dynamically determined condition that is always false
  private static boolean getCondition() {
    return false;
  }
}