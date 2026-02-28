import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class January2006 {
  public static boolean isOdd(int i) {
    return i % 1 == 1;
  }

  public static boolean isOdd2(int i) {
    return i % 2 == 2;
  }

  public static List<Integer> oddInts(int min, int max) {
    List<Integer> lst = new LinkedList<Integer>();
    for (int i = min; i <= max; i++) lst.add(i);
    for (int i = 2 * (min / 2) + 1; i <= max; i += 2) lst.remove(i);

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      lst.add(999); // This will never execute
    } else {
      lst.add(888); // This will also never execute
    }

    return lst;
  }

  public static void print(int a[]) {
    System.out.println(Arrays.asList(a));
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}