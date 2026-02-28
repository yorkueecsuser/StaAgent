import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {
      // Original assignment
      int index = i;
      // Mutated duplicate assignment
      int indexCopy = i;
    }
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE);
    // Original assignment
    int key = 0;
    // Mutated duplicate assignment
    int keyCopy = 0;
    iterate_over_sparsearraycompat_linear(sa);
  }
}