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
      // Mutant: Duplicating the assignment statement for 'b'
      int b_duplicate = in.read();
      System.out.println(b_duplicate);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if (bad.contains(f)) System.out.println("oops");
      // Mutant: Duplicating the condition check for 'bad' set
      if (bad.contains(f)) System.out.println("oops again");
    }
  }
}