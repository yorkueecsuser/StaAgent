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

    // Mutated code
    HashSet<Integer> a = new HashSet<Integer>();
    a.add(1);
    a.add(2);
    LinkedList<Integer> b = new LinkedList<Integer>();
    b.add(1);
    b.add(2);
    LinkedList<String> c = new LinkedList<String>();
    c.add("x");
    c.add("y");
    System.out.println(test1(a, b));
    System.out.println(test2(a, b));
    System.out.println(test3(a, c));
    System.out.println(test4(a, c));
  }
}