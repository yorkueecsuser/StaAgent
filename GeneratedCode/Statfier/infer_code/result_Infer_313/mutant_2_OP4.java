import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class CollectionsTest {

  int binary_search_log(List<String> list) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    return Collections.binarySearch(list, "x");
  }

  void shuffle_linear(List<String> list, Random mRandom) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    Collections.shuffle(list, mRandom);
    for (int i = 0; i < list.size(); i++) {}
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (String s : set) {}
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (String s : list) {}
  }

  void fill_linear(List<String> list, String el) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    Collections.fill(list, el);
  }

  void reverse_linear(List<String> list) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    Collections.reverse(list);
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    Collections.reverse(list);
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    Collections.copy(list_to, list_from);
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (int i = 0; i < unmod_list.size(); i++) {}
  }

  void unmodifiable_map(Map<String, String> map) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
  }

  void unmodifiable_set(Set<Integer> set) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (Integer el : Collections.unmodifiableSet(set)) {}
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (String s : set) {}
  }

  void emptyList_constant() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
  }

  void singletonMap_constant() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
  }

  void globalEmptyList_constant() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that does not affect the original functionality
      System.out.println("Condition is true, but this is just for mutation.");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}