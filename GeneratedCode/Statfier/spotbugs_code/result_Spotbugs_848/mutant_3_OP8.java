import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class SetTests {

  public void test1NoBugs(Set<String> set) {
    set.contains("Hello");
    set.remove("Hello");
  }

  public void test1Bugs(Set<String> set) {
    set.contains(new StringBuffer("Key"));
    set.remove(new StringBuffer("Key"));
  }

  public void test2NoBugs(SortedSet<CharSequence> set) {
    set.contains(new StringBuffer("Key"));
  }

  public void test2Bugs(SortedSet<CharSequence> set) {
    set.contains(Integer.valueOf(3));
  }

  public void test3NoBugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(new StringBuffer("Key"));
  }

  public void test3Bugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(Integer.valueOf(3));
  }

  public void test4NoBugs(TreeSet<? super CharSequence> set) {
    set.contains(new StringBuffer("Key"));
  }

  public void test4Bugs(TreeSet<? super CharSequence> set) {
    set.contains(Integer.valueOf(3));
  }

  // Mutated methods with renamed variables
  public void test1NoBugsMutant(Set<String> x) {
    x.contains("Hello");
    x.remove("Hello");
  }

  public void test2NoBugsMutant(SortedSet<CharSequence> y) {
    y.contains(new StringBuffer("Key"));
  }

  public void test3NoBugsMutant(LinkedHashSet<? extends CharSequence> z) {
    z.remove(new StringBuffer("Key"));
  }

  public void test4NoBugsMutant(TreeSet<? super CharSequence> w) {
    w.contains(new StringBuffer("Key"));
  }
}