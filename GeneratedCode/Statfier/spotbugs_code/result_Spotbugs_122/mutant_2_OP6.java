class Bar {
  static Class other;

  static {
    other = Foo.other;

    // Introduced an unreachable for loop as per the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}