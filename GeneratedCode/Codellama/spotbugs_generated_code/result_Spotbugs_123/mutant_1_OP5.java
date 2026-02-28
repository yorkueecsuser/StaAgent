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

    /* Unreachable switch statement mutant */
    int value = getValue();
    switch(value) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
      default:
        System.out.println("Unreachable default case");
        break;
    }
  }

  public static int getValue() {
    return 0;
  }
}