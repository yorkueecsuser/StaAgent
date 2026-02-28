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
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
      if (bad.contains(f)) System.out.println("oops");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}