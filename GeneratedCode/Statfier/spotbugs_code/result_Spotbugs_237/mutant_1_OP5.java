import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.FindUnrelatedTypesInGenericContainer;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

@DetectorUnderTest(FindUnrelatedTypesInGenericContainer.class)
class Ideas_2011_07_24 {

  @ExpectWarning("EC_UNRELATED_TYPES")
  static boolean test1(HashSet<Integer> s, LinkedList<Integer> lst) {
    // Unreachable switch statement mutation
    boolean condition = getRandomNonnegativeLong() == Long.MAX_VALUE;
    switch (condition? 1 : 0) {
      case 1:
        System.out.println("This is unreachable");
        break;
    }
    return s.equals(lst);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  static boolean test2(HashSet<Integer> s, LinkedList<Integer> lst) {
    return s.containsAll(lst) && lst.containsAll(s);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  static boolean test3(HashSet<Integer> s, LinkedList<String> lst) {
    // Unreachable switch statement mutation
    boolean condition = getRandomNonnegativeLong() == Long.MAX_VALUE;
    switch (condition? 1 : 0) {
      case 1:
        System.out.println("This is unreachable");
        break;
    }
    return s.equals(lst);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  static boolean test4(HashSet<Integer> s, LinkedList<String> lst) {
    return s.containsAll(lst) && lst.containsAll(s);
  }

  static long getRandomNonnegativeLong() {
    return Math.abs(new Random().nextLong());
  }

  public static void main(String args[]) {
    HashSet<Integer> s = new HashSet<Integer>();
    s.add(1);
    s.add(2);
    LinkedList<Integer> iList = new LinkedList<Integer>();
    iList.add(1);
    iList.add(2);
    LinkedList<String> sList = new LinkedList<String>();
    sList.add("x");
    sList.add("y");
    System.out.println(test1(s, iList));
    System.out.println(test2(s, iList));
    System.out.println(test3(s, sList));
    System.out.println(test4(s, sList));

    // Unreachable switch statement mutation in main
    boolean conditionMain = getRandomNonnegativeLong() == Long.MAX_VALUE;
    switch (conditionMain? 1 : 0) {
      case 1:
        System.out.println("This is unreachable in main");
        break;
    }
  }
}