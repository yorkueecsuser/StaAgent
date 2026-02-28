import java.util.Arrays;

class BC_IMPOSSIBLE_INSTANCEOF {
  public static void main(String[] args) {
    String[] arr = {"Hello", "World"};
    showBug(arr);
  }

  public static void showBug(String[] arr) {
    if (arr instanceof Object[]) {
      System.out.println("The array is an instance of Object[]");
    } else {
      System.out.println("The array is not an instance of Object[]");
    }
  }
}

// Renamed variable 'arr' to 'a'
class BC_IMPOSSIBLE_INSTANCEOF {
  public static void main(String[] args) {
    String[] a = {"Hello", "World"};
    showBug(a);
  }

  public static void showBug(String[] a) {
    if (a instanceof Object[]) {
      System.out.println("The array is an instance of Object[]");
    } else {
      System.out.println("The array is not an instance of Object[]");
    }
  }
}