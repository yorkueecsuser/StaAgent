import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {
      // Introduced an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is intended to be unreachable
        System.out.println("This will never be printed");
      } else {
        // Alternative block
        System.out.println("This will always be printed if condition is false");
      }
    }
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear(sa);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-block is unreachable
  }
}