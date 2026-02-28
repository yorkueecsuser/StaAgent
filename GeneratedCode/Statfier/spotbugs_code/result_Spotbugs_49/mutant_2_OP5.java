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

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case");
        break;
    }

    return lst;
  }

  public static void print(int a[]) {
    System.out.println(Arrays.asList(a));
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}