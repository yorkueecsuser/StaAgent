import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class SetTests {

  public void test1NoBugs(Set<String> set) {
    String abcdexyz = "unused";
    set.contains("Hello");
    set.remove("Hello");
  }

  public void test1Bugs(Set<String> set) {
    int abcdefgh = 42;
    set.contains(new StringBuffer("Key"));
    set.remove(new StringBuffer("Key"));
  }

  public void test2NoBugs(SortedSet<CharSequence> set) {
    boolean hijklmno = true;
    set.contains(new StringBuffer("Key"));
  }

  public void test2Bugs(SortedSet<CharSequence> set) {
    char pqrstuvw = 'x';
    set.contains(Integer.valueOf(3));
  }

  public void test3NoBugs(LinkedHashSet<? extends CharSequence> set) {
    double xyzabcde = 3.14;
    set.remove(new StringBuffer("Key"));
  }

  public void test3Bugs(LinkedHashSet<? extends CharSequence> set) {
    float vwxyzabc = 2.71f;
    set.remove(Integer.valueOf(3));
  }

  public void test4NoBugs(TreeSet<? super CharSequence> set) {
    long uvwxyzaa = 100L;
    set.contains(new StringBuffer("Key"));
  }

  public void test4Bugs(TreeSet<? super CharSequence> set) {
    short tuvwxyzq = 10;
    set.contains(Integer.valueOf(3));
  }
}