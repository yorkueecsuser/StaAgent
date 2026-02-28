import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadLineTest {

  public static void main(String args[]) throws Exception {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String x = in.readLine();
    System.out.println(x.hashCode());

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }

    x = in.readLine();
    System.out.println(x.hashCode());

    System.out.println(in.readLine().hashCode());

    System.out.println(in.readLine().hashCode());
  }

  // Method to provide a dynamic condition that always evaluates to false
  private static boolean getCondition() {
    return false;
  }
}