import java.util.ArrayList;

class PurityModeled {

  double math_random_impure() {
    return Math.random();
  }

  void arraycopy_pure(int[] src) {
    int[] dst = {5, 10, 20, 30, 40, 50};
    // copies an array from the specified source array
    System.arraycopy(src, 0, dst, 0, 1);

    // Unreachable if-else statement
    boolean condition = false;
    if (condition) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  enum Color {
    RED,
    GREEN,
    BLUE; // values() calls clone
  }

  public void enum_iter_pure() {
    for (Color c : Color.values()) {}

    // Unreachable if-else statement
    boolean condition = false;
    if (condition) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  @SuppressWarnings("unchecked")
  void clone_pure(ArrayList<String> list) {
    ArrayList<String> cloned = (ArrayList<String>) list.clone();
    cloned.add(""); // no change the list

    // Unreachable if-else statement
    boolean condition = false;
    if (condition) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }
}