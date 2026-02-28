import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;

class UnknownCallsTest {

  private int mBytesToRead;

  public void jsonArray_linear(JSONArray jsonArray) {
    int length = jsonArray.length();
    for (int i = 0; i < length; ++i) {}
    
    // Mutant: Rename 'length' to 'a'
    int a = jsonArray.length();
    for (int b = 0; b < a; ++b) {}
  }

  public void jsonArray_constant() {
    JSONArray jsonArray = new JSONArray();
    jsonArray.put(1);
    for (int i = 0; i < jsonArray.length(); ++i) {}
    
    // Mutant: Rename 'jsonArray' to 'c'
    JSONArray c = new JSONArray();
    c.put(1);
    for (int d = 0; d < c.length(); ++d) {}
  }

  public int read_sum_cost(
      InputStream in, byte[] buffer, int byteOffset, int byteCount, ArrayList<Integer> list)
      throws IOException {
    int maxBytesToRead = Math.min(byteCount, mBytesToRead);
    int bytesRead = in.read(buffer, byteOffset, maxBytesToRead);

    for (int index = 0; index < bytesRead + maxBytesToRead; ++index) {}
    return 0;
    
    // Mutant: Rename'maxBytesToRead' to 'e'
    int e = Math.min(byteCount, mBytesToRead);
    int f = in.read(buffer, byteOffset, e);
    for (int g = 0; g < f + e; ++g) {}
    return 0;
  }

  // Expected: linear
  public int read_max_cost(
      InputStream in, byte[] buffer, int byteOffset, int byteCount, ArrayList<Integer> list)
      throws IOException {
    int maxBytesToRead = Math.min(byteCount, mBytesToRead);
    int bytesRead = in.read(buffer, byteOffset, maxBytesToRead);
    if (bytesRead > 0) {
      maxBytesToRead = bytesRead + 1;
    }
    for (int index = 0; index < maxBytesToRead; ++index) {}
    return 0;
    
    // Mutant: Rename 'bytesRead' to 'h'
    int h = in.read(buffer, byteOffset, maxBytesToRead);
    if (h > 0) {
      maxBytesToRead = h + 1;
    }
    for (int i = 0; i < maxBytesToRead; ++i) {}
    return 0;
  }

  private static void loop_over_charArray_FP(StringBuilder builder, String input) {
    for (Character c : input.toCharArray()) {}
    
    // Mutant: Rename 'builder' to 'j'
    for (Character k : input.toCharArray()) {}
  }

  private static void call_loop_over_charArray_FP(StringBuilder out, String in) {
    loop_over_charArray_FP(out, in);
    
    // Mutant: Rename 'out' to 'l'
    loop_over_charArray_FP(l, in);
  }

  // hashCode is impure but we don't invalidate all other library
  // calls such as size()
  void unmodeled_impure_linear(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      list.get(i).hashCode();
    }
    
    // Mutant: Rename 'list' to'm'
    for (int n = 0; n < m.size(); n++) {
      m.get(n).hashCode();
    }
  }

  // functions that just throw have 0 cost to prevent diff reporting
  int throw_exception() {
    throw new IllegalStateException();
  }

  void call_throw_exception_unknown() {
    for (int i = 0; i < throw_exception(); i++) {}
    
    // Mutant: Rename 'i' to 'o'
    for (int o = 0; o < throw_exception(); o++) {}
  }

  boolean unknown_bool;

  int may_throw_exception() {
    if (unknown_bool) {
      throw new IllegalStateException();
    } else {
      return 10;
    }
  }

  void call_may_throw_exception_constant() {
    for (int i = 0; i < may_throw_exception(); i++) {}
    
    // Mutant: Rename 'i' to 'p'
    for (int p = 0; p < may_throw_exception(); p++) {}
  }

  abstract class AbstractC {
    abstract int[] abstract_func();
  }

  void call_concrete_func_linear_FP(AbstractC x) {
    int[] a = x.abstract_func();
    for (int i = 0; i < a.length; i++) {}
    
    // Mutant: Rename 'a' to 'q'
    int[] q = x.abstract_func();
    for (int r = 0; r < q.length; r++) {}
  }
}