import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

class Ideas_2011_07_27 {

  HashSet<Integer> bad = new HashSet<Integer>();

  public void test(String f) {

    try {
      FileInputStream in = new FileInputStream(f);
      int b = in.read();
      System.out.println(b);
      
      // Inserted unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is reachable code");
      } else {
        System.out.println("This is unreachable code");
      }
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if (bad.contains(f)) System.out.println("oops");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This ensures the if block is reachable and the else block is unreachable
  }
}