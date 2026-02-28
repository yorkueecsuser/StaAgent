class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;
    System.out.println(count);

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}