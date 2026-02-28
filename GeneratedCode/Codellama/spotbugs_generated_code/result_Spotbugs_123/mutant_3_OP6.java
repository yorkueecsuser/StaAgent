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
    for (int i = 0; false; i++) {
      System.out.println("This unreachable for loop should not execute");
    }
  }
}