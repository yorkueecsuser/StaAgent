import java.util.Arrays;

class Array {

  public void array_access_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 1] = radii[i] + 1;
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  public void array_access_overrun_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 2] = radii[i] + 1;
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void array_access_weird_linear(long[] optionNumerators, int length) {
    for (int j = 0; j < length; ++j) {
      if (10 < optionNumerators[j] + 1) {}
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  int binary_search_log(String[] arr) {
    return Arrays.binarySearch(arr, "x");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void fill_linear(String[] arr) {
    Arrays.fill(arr, "x");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void copyOf_linear(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, arr.length);
    for (String el : new_arr) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void copyOf_constant(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, 10);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void init_array_constant() {
    int[] table = new int[256];
    for (int i = 0; i < table.length; ++i) {
      table[i] = i;
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void fill_big_constant() {
    String[] arr = new String[300];
    Arrays.fill(arr, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void sort_array_nlogn(int size) {
    String[] arr = new String[size];
    Arrays.sort(arr);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void bsearch_log(int i) {
    String[] arr = new String[i];
    Arrays.binarySearch(arr, "u");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  String[] gen_and_iter_types(int length) {
    String[] result = new String[length];
    for (int i = 0; i < length; i++) {}
    return result;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void call_gen_and_iter_types(int x) {
    String[] r = gen_and_iter_types(x);
    for (int i = 0; i < r.length; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  // Inferbo abstracts allocated memory locations to allocation sites
  // (program points) and only keeps one location. This is a FP
  // because our domain cannot express joining of two symbolic values
  // and gives Top instead.
  void call_gen_and_iter_types_linear_FP(int x, int y) {
    String[] r1 = gen_and_iter_types(x);
    String[] r2 = gen_and_iter_types(y);
    for (int i = 0; i < r2.length; i++) {} // should not be infinite execution time
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void toArray_linear(java.util.ArrayList<String> list) {
    for (int i = 0; i < list.toArray().length; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void toArray_map_linear(java.util.Map<String, Integer> map) {
    for (int i = 0; i < map.values().toArray().length; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  private static final String[] static_final_field = new String[] {"", ""};

  void use_static_final_array_field_constant() {
    for (int i = 0; i < static_final_field.length; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  private boolean getCondition() {
    return false;
  }
}