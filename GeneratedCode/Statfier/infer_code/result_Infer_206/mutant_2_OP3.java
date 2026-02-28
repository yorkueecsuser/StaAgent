class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    int[] array = atest.get_testArray();
    atest.mutate_param_ok(array); // ERROR!

    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method returns false, making the if block unreachable at runtime
  }
}