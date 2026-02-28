import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {
      int temp = i; // Original assignment
      int temp = i; // Duplicated assignment
    }
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE); // Original assignment
    sa.put(0, Integer.MAX_VALUE); // Duplicated assignment
    iterate_over_sparsearraycompat_linear(sa);
  }
}