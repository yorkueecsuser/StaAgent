class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    int[] array = atest.get_testArray();
    atest.mutate_param_ok(array); // ERROR!

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case will always be reached
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}