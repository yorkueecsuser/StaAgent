import android.util.SparseArray;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

class CollectionTest {

  interface MyCollection<E> extends Collection<E> {}

  void iterate_over_mycollection(MyCollection<Integer> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0, size = list.size(); i < size; ++i) {}
  }

  void iterate_over_some_java_collection(
      ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (MyCollection<Integer> list : mSubscribers) {}
  }

  void iterate_over_mycollection_quad(ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (MyCollection<Integer> list : mSubscribers) {
      iterate_over_mycollection(list);
    }
  }

  // expected: same as iterate_over_mycollection(list)
  void ensure_call(MyCollection<Integer> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    iterate_over_mycollection(list);
  }

  // expected: O (|size|. |list|)
  void loop_over_call(int size, MyCollection<Integer> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < size; i++) {
      iterate_over_mycollection(list);
    }
  }

  // expected: O (|list|^2)
  void iterate_over_call_quad(int size, MyCollection<Integer> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (Integer i : list) {
      iterate_over_mycollection(list);
    }
  }

  // expected O (|list|^3)
  void nested_iterator_qubic(int size, MyCollection<Integer> list1, MyCollection<Integer> list2) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (Integer i : list1) {
      for (Integer j : list2) {
        iterate_over_mycollection(list1);
        iterate_over_mycollection(list1);
      }
    }
  }

  void sparse_array_linear(SparseArray<Integer> arr) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < arr.size(); i++) {}
  }

  void sparse_array_new_constant() {
    SparseArray<Integer> new_arr = new SparseArray<Integer>();
    new_arr.put(1, 1);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < new_arr.size(); i++) {}
  }

  static class Dummy {}

  public enum MyEnumType {
    /* The elements of enum is initialized in `<clinit>`. */
    A(1);

     int mValue;

    private MyEnumType(int i) {
      mValue = i;
    }

    /* This field is also initialized in `<clinit>`, in which `<init>` is called. */
    private static Dummy s =
        new Dummy() {
          {
            boolean condition = getCondition();
            if (condition) {
              // Unreachable if statement
              System.out.println("This is unreachable");
            }
            /* This loop is in `<init>` function. It needs the results of `<clinit>` in order to
            get `MyEnumType.values()`. */
            for (MyEnumType type : MyEnumType.values()) {}
          }
        };
  }

  void immutable_set_of_constant() {
    ImmutableSet<Integer> set = ImmutableSet.of();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < set.size(); i++) {}
  }

  void immutable_set_of_multiple_constant() {
    ImmutableSet<Integer> set = ImmutableSet.of(1, 2, 3, 4, 5);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < set.size(); i++) {}
  }

  // O(|keyMap| x |coll|)
  void containsAll_quadratic(HashMap<Integer, String> keyMap, Collection<String> coll) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    keyMap.values().containsAll(coll);
  }

  void containsNull_linear(HashMap<Integer, String> keyMap) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    keyMap.values().contains(null);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}