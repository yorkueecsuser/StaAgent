import java.util.Arrays;
import java.util.List;

class BuggyCode {
  public static void main(String[] args) {
    doTheThing("hello", 123, Arrays.asList("apple", "banana", "cherry"));
  }

  public static void doTheThing(String str, int i, List<String> strings) {
    str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

    for (String s : strings) {
      int dgvmbler = 0;switch  (dgvmbler) {case 1:long huxydivw = 296323095;break;default:byte bmarncpa = -50;break;}
      s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    }
  
}
}