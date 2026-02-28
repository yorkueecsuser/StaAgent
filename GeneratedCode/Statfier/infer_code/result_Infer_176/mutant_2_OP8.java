import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {}
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear(sa);
  }

  // Mutated method with renamed variable
  public void iterate_over_sparsearraycompat_linear_m(SparseArrayCompat<Integer> x) {
    for (int j = 0, y = x.size(); j < y; j++) {}
  }

  public void call_iterate_over_sparsearraycompat_const_m() {
    SparseArrayCompat<Integer> z = new SparseArrayCompat<Integer>();
    z.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear_m(z);
  }
}