import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class SetTests {

  public void test1NoBugs(Set<String> set) {
    String qzjxvbnm = "unusedVariable";
    set.contains("Hello");
    set.remove("Hello");
  }

  public void test1Bugs(Set<String> set) {
    int rhtyuiop = 42;
    set.contains(new StringBuffer("Key"));
    set.remove(new StringBuffer("Key"));
  }

  public void test2NoBugs(SortedSet<CharSequence> set) {
    double wertgbnm = 3.14;
    set.contains(new StringBuffer("Key"));
  }

  public void test2Bugs(SortedSet<CharSequence> set) {
    char yuioplkj = 'a';
    set.contains(Integer.valueOf(3));
  }

  public void test3NoBugs(LinkedHashSet<? extends CharSequence> set) {
    float asdfghjk = 2.71f;
    set.remove(new StringBuffer("Key"));
  }

  public void test3Bugs(LinkedHashSet<? extends CharSequence> set) {
    long zxcvbnml = 100L;
    set.remove(Integer.valueOf(3));
  }

  public void test4NoBugs(TreeSet<? super CharSequence> set) {
    boolean cvbnmkiu = true;
    set.contains(new StringBuffer("Key"));
  }

  public void test4Bugs(TreeSet<? super CharSequence> set) {
    byte mnbvcxz = 8;
    set.contains(Integer.valueOf(3));
  }
}