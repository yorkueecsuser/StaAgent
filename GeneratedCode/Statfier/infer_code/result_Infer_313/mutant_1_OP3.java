import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class CollectionsTest {

  int binary_search_log(List<String> list) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return Collections.binarySearch(list, "x");
  }

  void shuffle_linear(List<String> list, Random mRandom) {
    Collections.shuffle(list, mRandom);
    for (int i = 0; i < list.size(); i++) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    for (String s : set) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    for (String s : list) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void fill_linear(List<String> list, String el) {
    Collections.fill(list, el);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void reverse_linear(List<String> list) {
    Collections.reverse(list);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    Collections.reverse(list);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    Collections.copy(list_to, list_from);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    for (int i = 0; i < unmod_list.size(); i++) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void unmodifiable_map(Map<String, String> map) {
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void unmodifiable_set(Set<Integer> set) {
    for (Integer el : Collections.unmodifiableSet(set)) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    for (String s : set) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void emptyList_constant() {
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void singletonMap_constant() {
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void globalEmptyList_constant() {
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}