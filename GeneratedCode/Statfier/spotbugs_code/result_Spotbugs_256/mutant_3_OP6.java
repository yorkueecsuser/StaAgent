import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Ideas_2008_10_15<E> {

  public synchronized void wasModified(Collection<E> objects) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  public synchronized void wasModified(Object object) {
    wasModified(listOf(object));
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  public static <T> List<T> listOf(T e) {
    ArrayList<T> a = new ArrayList<T>();
    a.add(e);
    return a;
  }

  static class A<E> {
    void handle(E e) {
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will always return false
      }
    }
  }

  static class B<E> extends A<E> {
    @Override
    void handle(Object o) {
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will always return false
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the loops are unreachable
  }
}