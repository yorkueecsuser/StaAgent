import java.util.Arrays;

class Array {

  public void array_access_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 1] = radii[i] + 1;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        radii[i] = -1;
      } else {
        // Another unreachable code
        radii[i] = -2;
      }
    }
  }

  public void array_access_overrun_constant() {
    float[] radii = new float[8];
    for (int i = 0; i < 4; ++i) {
      radii[i * 2] = radii[i];
      radii[i * 2 + 2] = radii[i] + 1;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        radii[i] = -1;
      } else {
        // Another unreachable code
        radii[i] = -2;
      }
    }
  }

  void array_access_weird_linear(long[] optionNumerators, int length) {
    for (int j = 0; j < length; ++j) {
      if (10 < optionNumerators[j] + 1) {}
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        optionNumerators[j] = -1;
      } else {
        // Another unreachable code
        optionNumerators[j] = -2;
      }
    }
  }

  int binary_search_log(String[] arr) {
    return Arrays.binarySearch(arr, "x");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return -1;
    } else {
      // Another unreachable code
      return -2;
    }
  }

  void fill_linear(String[] arr) {
    Arrays.fill(arr, "x");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(arr, "y");
    } else {
      // Another unreachable code
      Arrays.fill(arr, "z");
    }
  }

  void copyOf_linear(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, arr.length);
    for (String el : new_arr) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(new_arr, "a");
    } else {
      // Another unreachable code
      Arrays.fill(new_arr, "b");
    }
  }

  void copyOf_constant(String[] arr) {
    String[] new_arr = Arrays.copyOf(arr, 10);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(new_arr, "c");
    } else {
      // Another unreachable code
      Arrays.fill(new_arr, "d");
    }
  }

  void init_array_constant() {
    int[] table = new int[256];
    for (int i = 0; i < table.length; ++i) {
      table[i] = i;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        table[i] = -1;
      } else {
        // Another unreachable code
        table[i] = -2;
      }
    }
  }

  void fill_big_constant() {
    String[] arr = new String[300];
    Arrays.fill(arr, 0);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(arr, "e");
    } else {
      // Another unreachable code
      Arrays.fill(arr, "f");
    }
  }

  void sort_array_nlogn(int size) {
    String[] arr = new String[size];
    Arrays.sort(arr);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(arr, "g");
    } else {
      // Another unreachable code
      Arrays.fill(arr, "h");
    }
  }

  void bsearch_log(int i) {
    String[] arr = new String[i];
    Arrays.binarySearch(arr, "u");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(arr, "i");
    } else {
      // Another unreachable code
      Arrays.fill(arr, "j");
    }
  }

  String[] gen_and_iter_types(int length) {
    String[] result = new String[length];
    for (int i = 0; i < length; i++) {}
    return result;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(result, "k");
    } else {
      // Another unreachable code
      Arrays.fill(result, "l");
    }
  }

  void call_gen_and_iter_types(int x) {
    String[] r = gen_and_iter_types(x);
    for (int i = 0; i < r.length; i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(r, "m");
    } else {
      // Another unreachable code
      Arrays.fill(r, "n");
    }
  }

  // Inferbo abstracts allocated memory locations to allocation sites
  // (program points) and only keeps one location. This is a FP
  // because our domain cannot express joining of two symbolic values
  // and gives Top instead.
  void call_gen_and_iter_types_linear_FP(int x, int y) {
    String[] r1 = gen_and_iter_types(x);
    String[] r2 = gen_and_iter_types(y);
    for (int i = 0; i < r2.length; i++) {} // should not be infinite execution time
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      Arrays.fill(r2, "o");
    } else {
      // Another unreachable code
      Arrays.fill(r2, "p");
    }
  }

  void toArray_linear(java.util.ArrayList<String> list) {
    for (int i = 0; i < list.toArray().length; i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      list.add("q");
    } else {
      // Another unreachable code
      list.add("r");
    }
  }

  void toArray_map_linear(java.util.Map<String, Integer> map) {
    for (int i = 0; i < map.values().toArray().length; i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      map.put("s", 1);
    } else {
      // Another unreachable code
      map.put("t", 2);
    }
  }

  private static final String[] static_final_field = new String[] {"", ""};

  void use_static_final_array_field_constant() {
    for (int i = 0; i < static_final_field.length; i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      static_final_field[0] = "u";
    } else {
      // Another unreachable code
      static_final_field[0] = "v";
    }
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}