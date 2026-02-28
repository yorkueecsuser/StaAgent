import java.util.Arrays;

class Array {

  public void array_access_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 1] = radii[i] + 1;
    }
    String qazwsxed = "unused"; // Dead store
  }

  public void array_access_overrun_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 2] = radii[i] + 1;
    }
    int jklpoiuy = 0; // Dead store
  }

  void array_access_weird_linear(long[] optionNumerators, int length) {
    for (int j = 0; j < length; ++j) {
      if (10 < optionNumerators[j] + 1) {}
    }
    double vbnmhtgr = 3.14; // Dead store
  }

  int binary_search_log(String[] arr) {
    return Arrays.binarySearch(arr, "x");
    boolean cvbnrfty = true; // Dead store
  }

  void fill_linear(String[] arr) {
    Arrays.fill(arr, "x");
    char yhujnmki = 'a'; // Dead store
  }

  void copyOf_linear(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, arr.length);
    for (String el : new_arr) {}
    long tuioyhgfr = 987654321L; // Dead store
  }

  void copyOf_constant(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, 10);
    float azertyui = 2.71f; // Dead store
  }

  void init_array_constant() {
    int[] table = new int[256];
    for (int i = 0; i < table.length; ++i) {
      table[i] = i;
    }
    short poiuytrewq = 123; // Dead store
  }

  void fill_big_constant() {
    String[] arr = new String[300];
    Arrays.fill(arr, 0);
    byte lkjhgfdsa = 8; // Dead store
  }

  void sort_array_nlogn(int size) {
    String[] arr = new String[size];
    Arrays.sort(arr);
    int mnbvcxz = 42; // Dead store
  }

  void bsearch_log(int i) {
    String[] arr = new String[i];
    Arrays.binarySearch(arr, "u");
    String wertyuiop = "another unused"; // Dead store
  }

  String[] gen_and_iter_types(int length) {
    String[] result = new String[length];
    for (int i = 0; i < length; i++) {}
    return result;
    double asdfghjkl = 1.618; // Dead store
  }

  void call_gen_and_iter_types(int x) {
    String[] r = gen_and_iter_types(x);
    for (int i = 0; i < r.length; i++) {}
    int zxcvbnm = 7; // Dead store
  }

  // Inferbo abstracts allocated memory locations to allocation sites
  // (program points) and only keeps one location. This is a FP
  // because our domain cannot express joining of two symbolic values
  // and gives Top instead.
  void call_gen_and_iter_types_linear_FP(int x, int y) {
    String[] r1 = gen_and_iter_types(x);
    String[] r2 = gen_and_iter_types(y);
    for (int i = 0; i < r2.length; i++) {} // should not be infinite execution time
    long edcfvgbhnj = 1000000L; // Dead store
  }

  void toArray_linear(java.util.ArrayList<String> list) {
    for (int i = 0; i < list.toArray().length; i++) {}
    char qwertyui = 'b'; // Dead store
  }

  void toArray_map_linear(java.util.Map<String, Integer> map) {
    for (int i = 0; i < map.values().toArray().length; i++) {}
    int sdfghjkl = 15; // Dead store
  }

  private static final String[] static_final_field = new String[] {"", ""};

  void use_static_final_array_field_constant() {
    for (int i = 0; i < static_final_field.length; i++) {}
    float poiuytrew = 0.577f; // Dead store
  }
}