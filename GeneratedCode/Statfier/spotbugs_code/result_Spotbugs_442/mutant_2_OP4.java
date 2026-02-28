import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadLineTest {

  public static void main(String args[]) throws Exception {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String x = in.readLine();
    System.out.println(x.hashCode());

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This is also never reached due to the condition");
    }

    x = in.readLine();
    System.out.println(x.hashCode());

    System.out.println(in.readLine().hashCode());

    System.out.println(in.readLine().hashCode());
  }
}