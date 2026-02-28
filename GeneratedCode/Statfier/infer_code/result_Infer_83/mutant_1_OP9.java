import java.util.*;

class IndexSkip {
  public static void main(String[] args) {
    foo(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
  }

  static void foo(ArrayList<Integer> xs) {
    int i = 0;
    do {
      int x = xs.get(i);
      if (x % 2 == 0) xs.remove(i);
      ++i;
    } while (i < xs.size());
  }
}