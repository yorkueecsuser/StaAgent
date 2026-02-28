class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    int[] array = atest.get_testArray();
    atest.mutate_param_ok(array); // ERROR!

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
      System.out.println("This is an unreachable loop");
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}