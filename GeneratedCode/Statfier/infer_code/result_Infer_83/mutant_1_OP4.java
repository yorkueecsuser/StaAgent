import java.util.*;

class IndexSkip {
  public static void main(String[] args) {
    foo(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
  }

  static void foo(ArrayList<Integer> xs) {
    for (int i = 0; i < xs.size(); ++i) {
      int x = xs.get(i);
      if (x % 2 == 0) xs.remove(i);

      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable block");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is another unreachable block");
      }
    }
  }

  // Method to return a condition that is always false
  static boolean getCondition() {
    return false;
  }
}