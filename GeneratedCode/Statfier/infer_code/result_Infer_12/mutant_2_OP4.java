import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;

class UnknownCallsTest {

  private int mBytesToRead;

  public void jsonArray_linear(JSONArray jsonArray) {
    int length = jsonArray.length();
    for (int i = 0; i < length; ++i) {}
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  public void jsonArray_constant() {
    JSONArray jsonArray = new JSONArray();
    jsonArray.put(1);
    for (int i = 0; i < jsonArray.length(); ++i) {}
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  public int read_sum_cost(
      InputStream in, byte[] buffer, int byteOffset, int byteCount, ArrayList<Integer> list)
      throws IOException {
    int maxBytesToRead = Math.min(byteCount, mBytesToRead);
    int bytesRead = in.read(buffer, byteOffset, maxBytesToRead);

    for (int index = 0; index < bytesRead + maxBytesToRead; ++index) {}
    return 0;
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
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
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  private static void loop_over_charArray_FP(StringBuilder builder, String input) {
    for (Character c : input.toCharArray()) {}
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  private static void call_loop_over_charArray_FP(StringBuilder out, String in) {
    loop_over_charArray_FP(out, in);
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  // hashCode is impure but we don't invalidate all other library
  // calls such as size()
  void unmodeled_impure_linear(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      list.get(i).hashCode();
    }
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  // functions that just throw have 0 cost to prevent diff reporting
  int throw_exception() {
    throw new IllegalStateException();
  }

  void call_throw_exception_unknown() {
    for (int i = 0; i < throw_exception(); i++) {}
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
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
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  abstract class AbstractC {
    abstract int[] abstract_func();
  }

  void call_concrete_func_linear_FP(AbstractC x) {
    int[] a = x.abstract_func();
    for (int i = 0; i < a.length; i++) {}
    // Mutation: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable");
    } else {
      // This block will always execute
      System.out.println("This is reachable");
    }
  }

  // Helper method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}