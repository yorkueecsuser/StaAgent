import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode());
    System.out.println("ToString: " + numbers.toString());

    // Unreachable switch statement
    int i = 0;
    switch (i) {
        case 1:
            System.out.println("Unreachable code");
            break;
        case 2:
            System.out.println("Unreachable code");
            break;
        default:
            System.out.println("Unreachable code");
    }
  }
}