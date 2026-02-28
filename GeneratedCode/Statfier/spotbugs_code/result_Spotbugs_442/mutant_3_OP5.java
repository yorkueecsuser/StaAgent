import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadLineTest {

  public static void main(String args[]) throws Exception {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This is also unreachable.");
        break;
    }

    String x = in.readLine();
    System.out.println(x.hashCode());

    x = in.readLine();
    System.out.println(x.hashCode());

    System.out.println(in.readLine().hashCode());

    System.out.println(in.readLine().hashCode());
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}