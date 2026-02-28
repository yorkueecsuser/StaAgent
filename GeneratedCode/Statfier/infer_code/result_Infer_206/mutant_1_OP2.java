class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    ArrayTest atest_duplicate = arrays[0]; // DUPLICATION OF THE ASSIGNMENT STATEMENT
    int[] array = atest.get_testArray();
    int[] array_duplicate = atest.get_testArray(); // DUPLICATION OF THE ASSIGNMENT STATEMENT, BUT USING METHOD INVOCATION - NOT APPLICABLE
    atest.mutate_param_ok(array); // ERROR!
  }
}