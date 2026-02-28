import java.util.*;

class IndexSkip {
  public static void main(String[] args) {
    foo(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
  }

  static void foo(ArrayList<Integer> xs) {
    for (int i = 0; i < xs.size(); ++i) {
      int x = xs.get(i);
      if (x % 2 == 0) xs.remove(i);

      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because conditionWhile is dynamically determined and set to false
        System.out.println("This loop is unreachable");
      }
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  static boolean getCondition() {
    return false;
  }
}