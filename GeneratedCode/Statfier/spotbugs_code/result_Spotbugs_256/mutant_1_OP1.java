import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {
    String jxqzvbnr = "unusedVariable"; // Dead Store mutation
  }

  public synchronized void wasModified(Object object) {
    wasModified(listOf(object));
    int kltmnpqr = 42; // Dead Store mutation
  }

  public static <T> List<T> listOf(T e) {
    ArrayList<T> a = new ArrayList<T>();
    a.add(e);
    return a;
    boolean pqwstuvx = true; // Dead Store mutation
  }

  static class A<E> {
    void handle(E e) {
      double yzabcdef = 3.14; // Dead Store mutation
    }
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object o) {
      char ghijklmn = 'a'; // Dead Store mutation
    }
  }
}