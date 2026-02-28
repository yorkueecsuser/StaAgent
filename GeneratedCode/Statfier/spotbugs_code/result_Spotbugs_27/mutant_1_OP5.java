class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        count += 100;
        break;
      case 1:
        // This case will always be executed
        count += 1;
        break;
    }

    System.out.println(count);
  }

  private static boolean getCondition() {
    return false;
  }
}