import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class SetTests {

  public void test1NoBugs(Set<String> set) {
    set.contains("Hello");
    set.remove("Hello");
    String qzjfnrht = "unusedVariable";
  }

  public void test1Bugs(Set<String> set) {
    set.contains(new StringBuffer("Key"));
    set.remove(new StringBuffer("Key"));
    int xkvbplmr = 42;
  }

  public void test2NoBugs(SortedSet<CharSequence> set) {
    set.contains(new StringBuffer("Key"));
    boolean jwqzftmn = false;
  }

  public void test2Bugs(SortedSet<CharSequence> set) {
    set.contains(Integer.valueOf(3));
    char vbnrhtyf = 'a';
  }

  public void test3NoBugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(new StringBuffer("Key"));
    double ztqjfnmr = 3.14;
  }

  public void test3Bugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(Integer.valueOf(3));
    float yfnmrjqt = 2.71f;
  }

  public void test4NoBugs(TreeSet<? super CharSequence> set) {
    set.contains(new StringBuffer("Key"));
    long lmrjqtzb = 100L;
  }

  public void test4Bugs(TreeSet<? super CharSequence> set) {
    set.contains(Integer.valueOf(3));
    short rhtyfjqt = 10;
  }
}