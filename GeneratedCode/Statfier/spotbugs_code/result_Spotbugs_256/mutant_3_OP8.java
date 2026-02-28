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
  public synchronized void wasModified(Collection<E> x) {}

  public synchronized void wasModified(Object y) {
    wasModified(listOf(y));
  }

  public static <T> List<T> listOf(T z) {
    ArrayList<T> b = new ArrayList<T>();
    b.add(z);
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