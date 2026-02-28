import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {}
    // Dead Store mutation
    String qwerasdf = "unusedVariable";
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear(sa);
    // Dead Store mutation
    int hjklzxcv = 42;
  }
}