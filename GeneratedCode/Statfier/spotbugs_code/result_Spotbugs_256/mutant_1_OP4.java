import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is always false
    }
  }

  public synchronized void wasModified(Object object) {
    wasModified(listOf(object));
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is always false
    }
  }

  public static <T> List<T> listOf(T e) {
    ArrayList<T> a = new ArrayList<T>();
    a.add(e);
    return a;
  }

  static class A<E> {
    void handle(E e) {
      // Introduced an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will run if shouldRun is true
      } else {
        // This block is unreachable because shouldRun is always false
      }
    }
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object o) {
      super.handle(o);
      // Introduced an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will run if shouldRun is true
      } else {
        // This block is unreachable because shouldRun is always false
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures that the condition is always false
  }
}