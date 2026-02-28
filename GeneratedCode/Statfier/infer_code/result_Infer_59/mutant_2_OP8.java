import java.util.ArrayList;

class PurityModeled {

  double math_random_impure() {
    return Math.random();
  }

  void arraycopy_pure(int[] src) {
    int[] dst = {5, 10, 20, 30, 40, 50};
    // copies an array from the specified source array
    System.arraycopy(src, 0, dst, 0, 1);
    
    // Mutant: Renaming'src' to 'a'
    int[] a = {5, 10, 20, 30, 40, 50};
    System.arraycopy(a, 0, dst, 0, 1);
  }

  enum Color {
    RED,
    GREEN,
    BLUE; // values() calls clone
  }

  public void enum_iter_pure() {
    for (Color c : Color.values()) {}
    
    // Mutant: Renaming 'c' to 'b'
    for (Color b : Color.values()) {}
  }

  @SuppressWarnings("unchecked")
  void clone_pure(ArrayList<String> list) {
    ArrayList<String> cloned = (ArrayList<String>) list.clone();
    cloned.add(""); // no change the list
    
    // Mutant: Renaming 'cloned' to 'x'
    ArrayList<String> x = (ArrayList<String>) list.clone();
    x.add("");
  }
}