import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {
    String qzjfnrht; // Dead store
  }

  public synchronized void wasModified(Object object) {
    wasModified(listOf(object));
    int xwvbnrht; // Dead store
  }

  public static <T> List<T> listOf(T e) {
    ArrayList<T> a = new ArrayList<T>();
    a.add(e);
    return a;
    boolean ytrkfnrh; // Dead store
  }

  static class A<E> {
    void handle(E e) {
      double wqejfnrh; // Dead store
    }
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object o) {
      char vbnrfnhg; // Dead store
    }
  }
}