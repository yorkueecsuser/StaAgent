import java.util.ArrayList;

class PurityModeled {

  double math_random_impure() {
    return Math.random();
  }

  void arraycopy_pure(int[] src) {
    int[] dst = {5, 10, 20, 30, 40, 50};
    // copies an array from the specified source array
    System.arraycopy(src, 0, dst, 0, 1);

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  enum Color {
    RED,
    GREEN,
    BLUE; // values() calls clone
  }

  public void enum_iter_pure() {
    for (Color c : Color.values()) {}

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @SuppressWarnings("unchecked")
  void clone_pure(ArrayList<String> list) {
    ArrayList<String> cloned = (ArrayList<String>) list.clone();
    cloned.add(""); // no change the list

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }
}