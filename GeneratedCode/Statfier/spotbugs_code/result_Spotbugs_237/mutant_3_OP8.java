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

  // Mutant: Renamed's' to 'a'
  @NoWarning("GC_UNRELATED_TYPES")
  static boolean test2(HashSet<Integer> a, LinkedList<Integer> lst) {
    return a.containsAll(lst) && lst.containsAll(a);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  static boolean test3(HashSet<Integer> s, LinkedList<String> lst) {
    return s.equals(lst);
  }

  // Mutant: Renamed 'lst' to 'b'
  @ExpectWarning("GC_UNRELATED_TYPES")
  static boolean test4(HashSet<Integer> s, LinkedList<String> b) {
    return s.containsAll(b) && b.containsAll(s);
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

    // Mutant: Renamed's' to 'c' in the main method
    HashSet<Integer> c = new HashSet<Integer>();
    c.add(1);
    c.add(2);
    LinkedList<Integer> d = new LinkedList<Integer>();
    d.add(1);
    d.add(2);
    LinkedList<String> e = new LinkedList<String>();
    e.add("x");
    e.add("y");
    System.out.println(test1(c, d));
    System.out.println(test2(c, d));
    System.out.println(test3(c, e));
    System.out.println(test4(c, e));
  }
}