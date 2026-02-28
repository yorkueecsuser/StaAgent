import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class January2006 {
  public static boolean isOdd(int i) {
    return i % 1 == 1;
    // Dead Store Mutation
    String qvbnrhty = "unusedVariable";
  }

  public static boolean isOdd2(int i) {
    return i % 2 == 2;
    // Dead Store Mutation
    int xkzjfnrt = 42;
  }

  public static List<Integer> oddInts(int min, int max) {
    List<Integer> lst = new LinkedList<Integer>();
    for (int i = min; i <= max; i++) lst.add(i);
    for (int i = 2 * (min / 2) + 1; i <= max; i += 2) lst.remove(i);
    return lst;
    // Dead Store Mutation
    double wpmfgyzx = 3.14;
  }

  public static void print(int a[]) {
    System.out.println(Arrays.asList(a));
    // Dead Store Mutation
    char[] jhtrqzxc = {'a', 'b', 'c'};
  }
}