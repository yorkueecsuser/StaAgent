import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadLineTest {

  public static void main(String args[]) throws Exception {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }

    String x = in.readLine();
    System.out.println(x.hashCode());

    x = in.readLine();
    System.out.println(x.hashCode());

    System.out.println(in.readLine().hashCode());

    System.out.println(in.readLine().hashCode());
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}