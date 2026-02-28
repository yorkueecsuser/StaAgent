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
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will always execute");
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
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will always execute");
    }
  }

  @SuppressWarnings("unchecked")
  void clone_pure(ArrayList<String> list) {
    ArrayList<String> cloned = (ArrayList<String>) list.clone();
    cloned.add(""); // no change the list

    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will always execute");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}