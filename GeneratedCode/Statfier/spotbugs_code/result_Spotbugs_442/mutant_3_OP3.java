import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadLineTest {

  public static void main(String args[]) throws Exception {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String x = in.readLine();
    System.out.println(x.hashCode());

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

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