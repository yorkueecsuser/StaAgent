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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
  }

  public static void closeAllSilentlyFP(Iterable<? extends Closeable> closeMe) {
    for (Closeable c : closeMe) {
      try {
        c.close();
      } catch (IOException e) {
        assert true;
      }
    }
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
  }

  public static boolean all(Predicate<String> predicate, List<String> lst) {
    for (String s : lst) if (!predicate.apply(s)) return false;
    return true;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
  }

  public static boolean allFP(Predicate<? super String> predicate, List<String> lst) {
    for (String s : lst) if (!predicate.apply(s)) return false;
    return true;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
  }

  public static void testAll() {
    List<String> lst = Collections.emptyList();
    // boolean b1 = all(Predicates.alwaysTrue(),lst);
    boolean b2 = allFP(Predicates.alwaysTrue(), lst);
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}