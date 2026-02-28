import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {}

  public synchronized void wasModified(Object object) {
    wasModified(listOf(object));
  }

  public static <T> List<T> listOf(T e) {
    ArrayList<T> a = new ArrayList<T>();
    a.add(e);
    return a;
  }

  static class A<E> {
    void handle(E e) {}
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object o) {}
  }

  // Mutated code
  public synchronized void wasModified(Collection<E> z) {}

  public synchronized void wasModified(Object x) {
    wasModified(listOf(x));
  }

  public static <T> List<T> listOf(T q) {
    ArrayList<T> b = new ArrayList<T>();
    b.add(q);
    return b;
  }

  static class A<E> {
    void handle(E r) {}
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object y) {}
  }
}