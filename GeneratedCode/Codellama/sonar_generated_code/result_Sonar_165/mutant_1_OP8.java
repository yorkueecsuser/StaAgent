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
  }

  public static void doTheThing(String z, int j, List<String> q) {
    z = Integer.toString(j); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

    for (String t : q) {
      t = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    }
  }
}