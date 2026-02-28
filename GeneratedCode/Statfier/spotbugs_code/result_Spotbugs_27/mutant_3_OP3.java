class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;

    // Mutant code: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      count += 100;
    }

    System.out.println(count);
  }

  // Method to return a constant false value, making the if condition always false
  private static boolean getCondition() {
    return false;
  }
}