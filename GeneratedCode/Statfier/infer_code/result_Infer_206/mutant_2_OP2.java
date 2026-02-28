class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    ArrayTest atest_duplicate = arrays[0]; // DUPLICATION of the assignment statement
    int[] array = atest.get_testArray();
    int[] array_duplicate = atest.get_testArray(); // This is not duplicated as per the rule, it uses method invocation
    atest.mutate_param_ok(array); // ERROR!
  }
}