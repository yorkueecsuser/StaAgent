class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    int[] array = atest.get_testArray();
    atest.mutate_param_ok(array); // ERROR!

    // Inserting unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the loop unreachable
  }
}