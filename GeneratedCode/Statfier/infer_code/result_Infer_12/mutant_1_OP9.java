import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;

class UnknownCallsTest {

  private int mBytesToRead;

  public void jsonArray_linear(JSONArray jsonArray) {
    int length = jsonArray.length();
    int i = 0;
    do {} while (++i < length);
  }

  public void jsonArray_constant() {
    JSONArray jsonArray = new JSONArray();
    jsonArray.put(1);
    int i = 0;
    do {} while (++i < jsonArray.length());
  }

  public int read_sum_cost(
      InputStream in, byte[] buffer, int byteOffset, int byteCount, ArrayList<Integer> list)
      throws IOException {
    int maxBytesToRead = Math.min(byteCount, mBytesToRead);
    int bytesRead = in.read(buffer, byteOffset, maxBytesToRead);

    int index = 0;
    do {} while (++index < bytesRead + maxBytesToRead);
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
    int index = 0;
    do {} while (++index < maxBytesToRead);
    return 0;
  }

  private static void loop_over_charArray_FP(StringBuilder builder, String input) {
    Character[] chars = input.toCharArray();
    int i = 0;
    do {} while (++i < chars.length);
  }

  private static void call_loop_over_charArray_FP(StringBuilder out, String in) {
    loop_over_charArray_FP(out, in);
  }

  // hashCode is impure but we don't invalidate all other library
  // calls such as size()
  void unmodeled_impure_linear(ArrayList<Integer> list) {
    int i = 0;
    do {
      list.get(i).hashCode();
    } while (++i < list.size());
  }

  // functions that just throw have 0 cost to prevent diff reporting
  int throw_exception() {
    throw new IllegalStateException();
  }

  void call_throw_exception_unknown() {
    int i = 0;
    do {} while (++i < throw_exception());
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
    int i = 0;
    do {} while (++i < may_throw_exception());
  }

  abstract class AbstractC {
    abstract int[] abstract_func();
  }

  void call_concrete_func_linear_FP(AbstractC x) {
    int[] a = x.abstract_func();
    int i = 0;
    do {} while (++i < a.length);
  }
}