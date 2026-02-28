// Mutant 1: Unreachable if-else statement
import java.util.Arrays;
import java.util.List;

class BuggyCode {
  public static void main(String[] args) {
    doTheThing("hello", 123, Arrays.asList("apple", "banana", "cherry"));
  }

  public static void doTheThing(String str, int i, List<String> strings) {
    if (getCondition()) { // Inserting unreachable if-else branch
      str = Integer.toString(i);
    } else {
      str = "hello world";
    }

    for (String s : strings) {
      s = "hello world";
    }
  }

  // Helper method to avoid compile-time constants
  public static boolean getCondition() {
    return true;
  }
}