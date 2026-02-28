import java.util.*;

class IndexSkip {
  public static void main(String[] args) {
    foo(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
  }

  static void foo(ArrayList<Integer> xs) {
    for (int i = 0; i < xs.size(); ++i) {
      int x = xs.get(i);
      int x_duplicate = xs.get(i); // Duplicate assignment
      if (x % 2 == 0) xs.remove(i);
    }
  }
}