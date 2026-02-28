import java.util.Arrays;

class Array {

  public void array_access_constant() {
    float[] radii = new float[8];
    int i = 0;
    do {
      radii[i * 2] = radii[i];
      radii[i * 2 + 1] = radii[i] + 1;
      ++i;
    } while (i < 4);
  }

  public void array_access_overrun_constant() {
    float[] radii = new float[8];
    int i = 0;
    do {
      radii[i * 2] = radii[i];
      radii[i * 2 + 2] = radii[i] + 1;
      ++i;
    } while (i < 4);
  }

  void array_access_weird_linear(long[] optionNumerators, int length) {
    int j = 0;
    do {
      if (10 < optionNumerators[j] + 1) {}
      ++j;
    } while (j < length);
  }

  int binary_search_log(String[] arr) {
    return Arrays.binarySearch(arr, "x");
  }

  void fill_linear(String[] arr) {
    Arrays.fill(arr, "x");
  }

  void copyOf_linear(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, arr.length);
    int i = 0;
    do {
      String el = new_arr[i];
      ++i;
    } while (i < new_arr.length);
  }

  void copyOf_constant(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, 10);
  }

  void init_array_constant() {
    int[] table = new int[256];
    int i = 0;
    do {
      table[i] = i;
      ++i;
    } while (i < table.length);
  }

  void fill_big_constant() {
    String[] arr = new String[300];
    Arrays.fill(arr, 0);
  }

  void sort_array_nlogn(int size) {
    String[] arr = new String[size];
    Arrays.sort(arr);
  }

  void bsearch_log(int i) {
    String[] arr = new String[i];
    Arrays.binarySearch(arr, "u");
  }

  String[] gen_and_iter_types(int length) {
    String[] result = new String[length];
    int i = 0;
    do {
      ++i;
    } while (i < length);
    return result;
  }

  void call_gen_and_iter_types(int x) {
    String[] r = gen_and_iter_types(x);
    int i = 0;
    do {
      ++i;
    } while (i < r.length);
  }

  // Inferbo abstracts allocated memory locations to allocation sites
  // (program points) and only keeps one location. This is a FP
  // because our domain cannot express joining of two symbolic values
  // and gives Top instead.
  void call_gen_and_iter_types_linear_FP(int x, int y) {
    String[] r1 = gen_and_iter_types(x);
    String[] r2 = gen_and_iter_types(y);
    int i = 0;
    do {
      ++i;
    } while (i < r2.length); // should not be infinite execution time
  }

  void toArray_linear(java.util.ArrayList<String> list) {
    int i = 0;
    do {
      ++i;
    } while (i < list.toArray().length);
  }

  void toArray_map_linear(java.util.Map<String, Integer> map) {
    int i = 0;
    do {
      ++i;
    } while (i < map.values().toArray().length);
  }

  private static final String[] static_final_field = new String[] {"", ""};

  void use_static_final_array_field_constant() {
    int i = 0;
    do {
      ++i;
    } while (i < static_final_field.length);
  }
}