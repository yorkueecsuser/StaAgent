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
      if (bad.contains(f)) System.out.println("oops");

      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          System.out.println("This will never be printed");
          break;
        case 1:
          System.out.println("This will always be executed instead");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is dynamically determined but always evaluates to false
  }
}