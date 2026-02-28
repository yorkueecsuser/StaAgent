import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {
      // Introduced an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 1 : 0) {
        case 2:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear(sa);
  }

  private boolean getCondition() {
    return false; // This method ensures the switch condition is dynamically determined but always false
  }
}