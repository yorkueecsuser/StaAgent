import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  public synchronized void wasModified(Object object) {
    wasModified(listOf(object));
    // Introduced another unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("Another unreachable statement.");
    }
  }

  public static <T> List<T> listOf(T e) {
    ArrayList<T> a = new ArrayList<T>();
    a.add(e);
    return a;
  }

  static class A<E> {
    void handle(E e) {
      // Introduced an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("Unreachable in A.handle.");
      }
    }
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object o) {
      super.handle(o);
      // Introduced an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("Unreachable in B.handle.");
      }
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the if blocks are unreachable
    return false;
  }
}