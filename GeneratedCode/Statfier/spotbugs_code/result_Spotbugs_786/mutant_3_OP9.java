import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

class Ideas_2010_06_08 {

  /** Method would be much more usable if it used wildcards */
  public static void closeAllSilently(Iterable<Closeable> closeMe) {
    Closeable c = null;
    Iterator<Closeable> iterator = closeMe.iterator();
    do {
      if (iterator.hasNext()) {
        c = iterator.next();
        try {
          c.close();
        } catch (IOException e) {
          assert true;
        }
      } else {
        break;
      }
    } while (true);
  }

  public static void closeAllSilentlyFP(Iterable<? extends Closeable> closeMe) {
    Closeable c = null;
    Iterator<Closeable> iterator = closeMe.iterator();
    do {
      if (iterator.hasNext()) {
        c = iterator.next();
        try {
          c.close();
        } catch (IOException e) {
          assert true;
        }
      } else {
        break;
      }
    } while (true);
  }

  public static boolean all(Predicate<String> predicate, List<String> lst) {
    Iterator<String> iterator = lst.iterator();
    String s = null;
    do {
      if (iterator.hasNext()) {
        s = iterator.next();
        if (!predicate.apply(s)) return false;
      } else {
        break;
      }
    } while (true);
    return true;
  }

  public static boolean allFP(Predicate<? super String> predicate, List<String> lst) {
    Iterator<String> iterator = lst.iterator();
    String s = null;
    do {
      if (iterator.hasNext()) {
        s = iterator.next();
        if (!predicate.apply(s)) return false;
      } else {
        break;
      }
    } while (true);
    return true;
  }

  public static void testAll() {
    List<String> lst = Collections.emptyList();
    // boolean b1 = all(Predicates.alwaysTrue(),lst);
    boolean b2 = allFP(Predicates.alwaysTrue(), lst);
  }
}