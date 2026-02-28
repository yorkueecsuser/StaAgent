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

    int value = getValue();
    switch(value) {
      case 1: // Unreachable code
        System.out.println("This code will never be executed");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }

  private static int getValue() {
    return 0;
  }
}