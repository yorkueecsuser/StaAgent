import java.util.Arrays;

class Array {

  public void array_access_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 1] = radii[i] + 1;
    }
    // Mutant
    float[] a = new float[8];
    for (int b = 0; b < 4; ++b) {
      a[b * 2] = a[b];
      a[b * 2 + 1] = a[b] + 1;
    }
  }

  public void array_access_overrun_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 2] = radii[i] + 1;
    }
    // Mutant
    float[] c = new float[8];
    for (int d = 0; d < 4; ++d) {
      c[d * 2] = c[d];
      c[d * 2 + 2] = c[d] + 1;
    }
  }

  void array_access_weird_linear(long[] optionNumerators, int length) {
    for (int j = 0; j < length; ++j) {
      if (10 < optionNumerators[j] + 1) {}
    }
    // Mutant
    for (int k = 0; k < length; ++k) {
      if (10 < optionNumerators[k] + 1) {}
    }
  }

  int binary_search_log(String[] arr) {
    return Arrays.binarySearch(arr, "x");
    // Mutant
    int e = Arrays.binarySearch(arr, "x");
    return e;
  }

  void fill_linear(String[] arr) {
    Arrays.fill(arr, "x");
    // Mutant
    String[] f = new String[arr.length];
    Arrays.fill(f, "x");
  }

  void copyOf_linear(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, arr.length);
    for (String el : new_arr) {}
    // Mutant
    String[] g = Arrays.copyOf(arr, arr.length);
    for (String h : g) {}
  }

  void copyOf_constant(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, 10);
    // Mutant
    String[] i = Arrays.copyOf(arr, 10);
  }

  void init_array_constant() {
    int[] table = new int[256];
    for (int i = 0; i < table.length; ++i) {
      table[i] = i;
    }
    // Mutant
    int[] j = new int[256];
    for (int k = 0; k < j.length; ++k) {
      j[k] = k;
    }
  }

  void fill_big_constant() {
    String[] arr = new String[300];
    Arrays.fill(arr, 0);
    // Mutant
    String[] l = new String[300];
    Arrays.fill(l, 0);
  }

  void sort_array_nlogn(int size) {
    String[] arr = new String[size];
    Arrays.sort(arr);
    // Mutant
    String[] m = new String[size];
    Arrays.sort(m);
  }

  void bsearch_log(int i) {
    String[] arr = new String[i];
    Arrays.binarySearch(arr, "u");
    // Mutant
    String[] n = new String[i];
    Arrays.binarySearch(n, "u");
  }

  String[] gen_and_iter_types(int length) {
    String[] result = new String[length];
    for (int i = 0; i < length; i++) {}
    return result;
    // Mutant
    String[] o = new String[length];
    for (int p = 0; p < length; p++) {}
    return o;
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
    String[] u = gen_and_iter_types(x);
    String[] v = gen_and_iter_types(y);
    for (int w = 0; w < v.length; w++) {}
  }

  void toArray_linear(java.util.ArrayList<String> list) {
    for (int i = 0; i < list.toArray().length; i++) {}
    // Mutant
    for (int x = 0; x < list.toArray().length; x++) {}
  }

  void toArray_map_linear(java.util.Map<String, Integer> map) {
    for (int i = 0; i < map.values().toArray().length; i++) {}
    // Mutant
    for (int y = 0; y < map.values().toArray().length; y++) {}
  }

  private static final String[] static_final_field = new String[] {"", ""};

  void use_static_final_array_field_constant() {
    for (int i = 0; i < static_final_field.length; i++) {}
    // Mutant
    for (int z = 0; z < static_final_field.length; z++) {}
  }
}