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

    // START: INSERTED CODE
    int value = 0;
    switch(value) {
      case 1:
        // code
        break;
      default:
        // code
        break;
    }
    // END: INSERTED CODE
  }
}