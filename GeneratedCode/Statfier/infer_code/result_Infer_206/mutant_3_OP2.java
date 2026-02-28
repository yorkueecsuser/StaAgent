class OuterTest {

  ArrayTest[] arrays;

  void mutate_via_field_bad() {
    ArrayTest atest = arrays[0];
    int[] array = atest.get_testArray();
    array = atest.get_testArray(); // DUPLICATION of the assignment statement
    atest.mutate_param_ok(array); // ERROR!
  }
}