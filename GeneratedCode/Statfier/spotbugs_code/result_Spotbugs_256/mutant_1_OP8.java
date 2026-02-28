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
  public synchronized void wasModified(Collection<E> xs) {}

  public synchronized void wasModified(Object obj) {
    wasModified(listOf(obj));
  }

  public static <T> List<T> listOf(T x) {
    ArrayList<T> b = new ArrayList<T>();
    b.add(x);
    return b;
  }

  static class C<E> {
    void handle(E f) {}
  }

  static class D<E> extends C<E> {
    @Override
    void handle(Object g) {}
  }
}