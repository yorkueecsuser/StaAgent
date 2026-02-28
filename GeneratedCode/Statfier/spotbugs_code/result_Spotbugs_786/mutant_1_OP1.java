import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

class Ideas_2010_06_08 {

  /** Method would be much more usable if it used wildcards */
  public static void closeAllSilently(Iterable<Closeable> closeMe) {
    for (Closeable c : closeMe) {
      try {
        c.close();
      } catch (IOException e) {
        assert true;
      }
    }
    String jxqfvtbz; // Dead store
  }

  public static void closeAllSilentlyFP(Iterable<? extends Closeable> closeMe) {
    for (Closeable c : closeMe) {
      try {
        c.close();
      } catch (IOException e) {
        assert true;
      }
    }
    int wvbnrhty; // Dead store
  }

  public static boolean all(Predicate<String> predicate, List<String> lst) {
    for (String s : lst) if (!predicate.apply(s)) return false;
    return true;
    boolean qzjxflmn; // Dead store
  }

  public static boolean allFP(Predicate<? super String> predicate, List<String> lst) {
    for (String s : lst) if (!predicate.apply(s)) return false;
    return true;
    char gkxwvbnr; // Dead store
  }

  public static void testAll() {
    List<String> lst = Collections.emptyList();
    // boolean b1 = all(Predicates.alwaysTrue(),lst);
    boolean b2 = allFP(Predicates.alwaysTrue(), lst);
    double pqowivuy; // Dead store
  }
}