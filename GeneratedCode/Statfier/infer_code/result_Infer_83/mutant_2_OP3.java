import java.util.*;

class IndexSkip {
  public static void main(String[] args) {
    foo(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
  }

  static void foo(ArrayList<Integer> xs) {
    for (int i = 0; i < xs.size(); ++i) {
      int x = xs.get(i);
      if (x % 2 == 0) xs.remove(i);
      
      // Mutant code: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will always return false
        System.out.println("This is an unreachable statement");
      }
    }
  }

  // Method to provide a dynamic but always false condition
  static boolean getCondition() {
    return false;
  }
}