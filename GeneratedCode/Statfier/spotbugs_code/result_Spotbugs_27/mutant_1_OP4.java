class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;

    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = false; // This will make the if-else branch unreachable
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }

    System.out.println(count);
  }
}