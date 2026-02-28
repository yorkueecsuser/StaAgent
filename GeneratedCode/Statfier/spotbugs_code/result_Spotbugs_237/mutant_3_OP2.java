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
    return s.equals(lst);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  static boolean test2(HashSet<Integer> s, LinkedList<Integer> lst) {
    return s.containsAll(lst) && lst.containsAll(s);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  static boolean test3(HashSet<Integer> s, LinkedList<String> lst) {
    return s.equals(lst);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  static boolean test4(HashSet<Integer> s, LinkedList<String> lst) {
    return s.containsAll(lst) && lst.containsAll(s);
  }

  static long getRandomNonnegativeLong() {
    long randomLong = Math.abs(new Random().nextLong());
    long randomLongCopy = Math.abs(new Random().nextLong()); // Duplicate assignment for mutation
    return randomLong;
  }

  public static void main(String args[]) {
    HashSet<Integer> s = new HashSet<Integer>();
    s.add(1);
    s.add(2);
    HashSet<Integer> sCopy = new HashSet<Integer>(); // Duplicate assignment for mutation
    sCopy.add(1);
    sCopy.add(2);
    LinkedList<Integer> iList = new LinkedList<Integer>();
    iList.add(1);
    iList.add(2);
    LinkedList<Integer> iListCopy = new LinkedList<Integer>(); // Duplicate assignment for mutation
    iListCopy.add(1);
    iListCopy.add(2);
    LinkedList<String> sList = new LinkedList<String>();
    sList.add("x");
    sList.add("y");
    LinkedList<String> sListCopy = new LinkedList<String>(); // Duplicate assignment for mutation
    sListCopy.add("x");
    sListCopy.add("y");
    System.out.println(test1(s, iList));
    System.out.println(test2(s, iList));
    System.out.println(test3(s, sList));
    System.out.println(test4(s, sList));
  }
}