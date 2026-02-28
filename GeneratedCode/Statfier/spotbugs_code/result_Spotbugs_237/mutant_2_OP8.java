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

  // Mutated version of test1
  @ExpectWarning("EC_UNRELATED_TYPES")
  static boolean test1a(HashSet<Integer> x, LinkedList<Integer> y) {
    return x.equals(y);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  static boolean test2(HashSet<Integer> s, LinkedList<Integer> lst) {
    return s.containsAll(lst) && lst.containsAll(s);
  }

  // Mutated version of test2
  @NoWarning("GC_UNRELATED_TYPES")
  static boolean test2a(HashSet<Integer> a, LinkedList<Integer> b) {
    return a.containsAll(b) && b.containsAll(a);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  static boolean test3(HashSet<Integer> s, LinkedList<String> lst) {
    return s.equals(lst);
  }

  // Mutated version of test3
  @ExpectWarning("EC_UNRELATED_TYPES")
  static boolean test3a(HashSet<Integer> m, LinkedList<String> n) {
    return m.equals(n);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  static boolean test4(HashSet<Integer> s, LinkedList<String> lst) {
    return s.containsAll(lst) && lst.containsAll(s);
  }

  // Mutated version of test4
  @ExpectWarning("GC_UNRELATED_TYPES")
  static boolean test4a(HashSet<Integer> p, LinkedList<String> q) {
    return p.containsAll(q) && q.containsAll(p);
  }

  static long getRandomNonnegativeLong() {
    return Math.abs(new Random().nextLong());
  }

  // Mutated version of getRandomNonnegativeLong
  static long getRandomNonnegativeLonga() {
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

    // Mutated version of main method
    HashSet<Integer> t = new HashSet<Integer>();
    t.add(1);
    t.add(2);
    LinkedList<Integer> jList = new LinkedList<Integer>();
    jList.add(1);
    jList.add(2);
    LinkedList<String> rList = new LinkedList<String>();
    rList.add("x");
    rList.add("y");
    System.out.println(test1a(t, jList));
    System.out.println(test2a(t, jList));
    System.out.println(test3a(t, rList));
    System.out.println(test4a(t, rList));
  }
}