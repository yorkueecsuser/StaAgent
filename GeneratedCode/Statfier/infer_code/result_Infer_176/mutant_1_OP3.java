import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {
      // Mutant: Adding an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable block");
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear(sa);
  }
}