import androidx.collection.SparseArrayCompat;

class AndroidXCollectionTest {

  public void iterate_over_sparsearraycompat_linear(SparseArrayCompat<Integer> sa) {
    for (int i = 0, size = sa.size(); i < size; i++) {}
    // Mutant: Renamed 'i' to 'x'
    for (int x = 0, size = sa.size(); x < size; x++) {}
  }

  public void call_iterate_over_sparsearraycompat_const() {
    SparseArrayCompat<Integer> sa = new SparseArrayCompat<Integer>();
    sa.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear(sa);
    // Mutant: Renamed'sa' to 'b'
    SparseArrayCompat<Integer> b = new SparseArrayCompat<Integer>();
    b.put(0, Integer.MAX_VALUE);
    iterate_over_sparsearraycompat_linear(b);
  }
}