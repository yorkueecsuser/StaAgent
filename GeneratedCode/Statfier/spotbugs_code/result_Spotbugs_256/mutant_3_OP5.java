import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

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

  private boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}