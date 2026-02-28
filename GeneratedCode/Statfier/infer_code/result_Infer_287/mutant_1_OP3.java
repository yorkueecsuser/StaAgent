import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class SetTest {

  // // Set.of creates an immutable set
  // private static final Set<String> StaticSet = Set.of("a");

  void contains_empty_constant(HashSet<String> set) {
    set.contains("");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  void containsAll_linear(Set<String> set, ArrayList<String> list) {
    set.containsAll(list);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement.");
    }
  }

  void removeAll_linear(HashSet<String> set, ArrayList<String> list) {
    set.removeAll(list);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable if statement.");
    }
  }

  // void loop_of_constant() {
  //   Set<String> my_set = Set.of("a", "b", "c", "d", "e", "f", "g");
  //   for (String el : my_set) {}
  // }

  // // here, we cannot yet recognize that StaticSet is an immutable set
  // // created by Set.of operation in the class initializer.
  // void immutable_set_of_constant_FP() {
  //   for (int i = 0; i <= StaticSet.size(); i++) {}
  // }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}