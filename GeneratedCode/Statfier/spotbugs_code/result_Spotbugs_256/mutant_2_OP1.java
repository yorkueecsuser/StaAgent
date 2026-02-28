import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {
    String qwejfnbx; // Dead store
  }

  public synchronized void wasModified(Object object) {
    wasModified(listOf(object));
    int klmnopqr; // Dead store
  }

  public static <T> List<T> listOf(T e) {
    ArrayList<T> a = new ArrayList<T>();
    a.add(e);
    return a;
    boolean rstuvwxy; // Dead store
  }

  static class A<E> {
    void handle(E e) {
      double abcdijkl; // Dead store
    }
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object o) {
      char mnopqrst; // Dead store
    }
  }
}