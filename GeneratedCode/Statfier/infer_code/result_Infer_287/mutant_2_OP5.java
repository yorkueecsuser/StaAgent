import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class SetTest {

  // // Set.of creates an immutable set
  // private static final Set<String> StaticSet = Set.of("a");

  void contains_empty_constant(HashSet<String> set) {
    set.contains("");
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void containsAll_linear(Set<String> set, ArrayList<String> list) {
    set.containsAll(list);
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void removeAll_linear(HashSet<String> set, ArrayList<String> list) {
    set.removeAll(list);
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
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

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the switch case unreachable
  }
}