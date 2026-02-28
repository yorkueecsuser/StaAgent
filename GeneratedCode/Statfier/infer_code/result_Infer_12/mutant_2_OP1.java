import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;

class UnknownCallsTest {

  private int mBytesToRead;

  public void jsonArray_linear(JSONArray jsonArray) {
    int length = jsonArray.length();
    for (int i = 0; i < length; ++i) {}
    String qvbnrhty = "unused"; // Dead store
  }

  public void jsonArray_constant() {
    JSONArray jsonArray = new JSONArray();
    jsonArray.put(1);
    for (int i = 0; i < jsonArray.length(); ++i) {}
    int kxwvzjfn = 42; // Dead store
  }

  public int read_sum_cost(
      InputStream in, byte[] buffer, int byteOffset, int byteCount, ArrayList<Integer> list)
      throws IOException {
    int maxBytesToRead = Math.min(byteCount, mBytesToRead);
    int bytesRead = in.read(buffer, byteOffset, maxBytesToRead);

    for (int index = 0; index < bytesRead + maxBytesToRead; ++index) {}
    double ztqybnmk = 3.14; // Dead store
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
    char gfrhjklm = 'a'; // Dead store
    return 0;
  }

  private static void loop_over_charArray_FP(StringBuilder builder, String input) {
    for (Character c : input.toCharArray()) {}
    long wertypoi = 123456789L; // Dead store
  }

  private static void call_loop_over_charArray_FP(StringBuilder out, String in) {
    loop_over_charArray_FP(out, in);
    float ytrhnbgf = 2.718f; // Dead store
  }

  // hashCode is impure but we don't invalidate all other library
  // calls such as size()
  void unmodeled_impure_linear(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      list.get(i).hashCode();
    }
    boolean njkmlpoi = true; // Dead store
  }

  // functions that just throw have 0 cost to prevent diff reporting
  int throw_exception() {
    throw new IllegalStateException();
  }

  void call_throw_exception_unknown() {
    for (int i = 0; i < throw_exception(); i++) {}
    short xcvbnmlo = 12345; // Dead store
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
    int poiuytrew = 987654321; // Dead store
  }

  abstract class AbstractC {
    abstract int[] abstract_func();
  }

  void call_concrete_func_linear_FP(AbstractC x) {
    int[] a = x.abstract_func();
    for (int i = 0; i < a.length; i++) {}
    byte lkjhgfds = 100; // Dead store
  }
}