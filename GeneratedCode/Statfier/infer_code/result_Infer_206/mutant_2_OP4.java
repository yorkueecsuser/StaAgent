class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    int[] array = atest.get_testArray();
    atest.mutate_param_ok(array); // ERROR!

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute because shouldRun will always be false
      System.out.println("This is an unreachable if block");
    } else {
      // This block should always execute
      System.out.println("This is the reachable else block");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}