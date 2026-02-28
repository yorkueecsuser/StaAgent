import java.util.Arrays;

class Array {

  public void array_access_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 1] = radii[i] + 1;
    }
    // Mutant
    float[] z = new float[8];
    for (int a = 0; a < 4; ++a) {
      z[a * 2] = z[a];
      z[a * 2 + 1] = z[a] + 1;
    }
  }

  public void array_access_overrun_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 2] = radii[i] + 1;
    }
    // Mutant
    float[] w = new float[8];
    for (int b = 0; b < 4; ++b) {
      w[b * 2] = w[b];
      w[b * 2 + 2] = w[b] + 1;
    }
  }

  void array_access_weird_linear(long[] optionNumerators, int length) {
    for (int j = 0; j < length; ++j) {
      if (10 < optionNumerators[j] + 1) {}
    }
    // Mutant
    for (int c = 0; c < length; ++c) {
      if (10 < optionNumerators[c] + 1) {}
    }
  }

  int binary_search_log(String[] arr) {
    return Arrays.binarySearch(arr, "x");
    // Mutant
    int d = Arrays.binarySearch(arr, "x");
    return d;
  }

  void fill_linear(String[] arr) {
    Arrays.fill(arr, "x");
    // Mutant
    String[] e = arr;
    Arrays.fill(e, "x");
  }

  void copyOf_linear(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, arr.length);
    for (String el : new_arr) {}
    // Mutant
    String[] f = Arrays.copyOf(arr, arr.length);
    for (String g : f) {}
  }

  void copyOf_constant(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, 10);
    // Mutant
    String[] h = Arrays.copyOf(arr, 10);
  }

  void init_array_constant() {
    int[] table = new int[256];
    for (int i = 0; i < table.length; ++i) {
      table[i] = i;
    }
    // Mutant
    int[] k = new int[256];
    for (int l = 0; l < k.length; ++l) {
      k[l] = l;
    }
  }

  void fill_big_constant() {
    String[] arr = new String[300];
    Arrays.fill(arr, 0);
    // Mutant
    String[] m = new String[300];
    Arrays.fill(m, 0);
  }

  void sort_array_nlogn(int size) {
    String[] arr = new String[size];
    Arrays.sort(arr);
    // Mutant
    String[] n = new String[size];
    Arrays.sort(n);
  }

  void bsearch_log(int i) {
    String[] arr = new String[i];
    Arrays.binarySearch(arr, "u");
    // Mutant
    String[] o = new String[i];
    Arrays.binarySearch(o, "u");
  }

  String[] gen_and_iter_types(int length) {
    String[] result = new String[length];
    for (int i = 0; i < length; i++) {}
    return result;
    // Mutant
    String[] p = new String[length];
    for (int q = 0; q < length; q++) {}
    return p;
  }

  void call_gen_and_iter_types(int x) {
    String[] r = gen_and_iter_types(x);
    for (int i = 0; i < r.length; i++) {}
    // Mutant
    String[] s = gen_and_iter_types(x);
    for (int t = 0; t < s.length; t++) {}
  }

  // Inferbo abstracts allocated memory locations to allocation sites
  // (program points) and only keeps one location. This is a FP
  // because our domain cannot express joining of two symbolic values
  // and gives Top instead.
  void call_gen_and_iter_types_linear_FP(int x, int y) {
    String[] r1 = gen_and_iter_types(x);
    String[] r2 = gen_and_iter_types(y);
    for (int i = 0; i < r2.length; i++) {} // should not be infinite execution time
    // Mutant
    String[] u1 = gen_and_iter_types(x);
    String[] u2 = gen_and_iter_types(y);
    for (int v = 0; v < u2.length; v++) {} // should not be infinite execution time
  }

  void toArray_linear(java.util.ArrayList<String> list) {
    for (int i = 0; i < list.toArray().length; i++) {}
    // Mutant
    for (int w = 0; w < list.toArray().length; w++) {}
  }

  void toArray_map_linear(java.util.Map<String, Integer> map) {
    for (int i = 0; i < map.values().toArray().length; i++) {}
    // Mutant
    for (int x = 0; x < map.values().toArray().length; x++) {}
  }

  private static final String[] static_final_field = new String[] {"", ""};

  void use_static_final_array_field_constant() {
    for (int i = 0; i < static_final_field.length; i++) {}
    // Mutant
    for (int y = 0; y < static_final_field.length; y++) {}
  }
}