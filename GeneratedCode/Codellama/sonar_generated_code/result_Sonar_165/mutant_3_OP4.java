import java.util.Arrays;
import java.util.List;

class BuggyCode {
  public static void main(String[] args) {
    doTheThing("hello", 123, Arrays.asList("apple", "banana", "cherry"));
  }

  public static void doTheThing(String str, int i, List<String> strings) {
    str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

    for (String s : strings) {
      s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    }

    if (getCondition()) {
      // unreachable code
      System.out.println("This code is unreachable");
    } else {
      // reachable code
      System.out.println("This code is reachable");
    }
  }

  public static boolean getCondition() {
    return false;
  }
}