import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Bug2829221 {
  public static void test(String[] args) throws IOException {
    InputStream is = new FileInputStream("test.txt");
    OutputStream os = new FileOutputStream("/tmp/test.txt");
    try {
      BufferedReader r = new BufferedReader(new InputStreamReader(is, "UTF-8"));
      PrintWriter w = new PrintWriter(new OutputStreamWriter(os, "UTF-8"));
      String line;
      while ((line = r.readLine())!= null) {
        w.println(line);
      }
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable if block.");
      } else {
        // This block should also never execute
        System.out.println("This is an unreachable else block.");
      }
      // Mutant code end
    } finally {
      is.close();
    }
  }

  public static void main(String[] args) throws IOException {
    InputStream is = new FileInputStream("test.txt");
    OutputStream os = new FileOutputStream("/tmp/test.txt");
    try {
      BufferedReader r = new BufferedReader(new InputStreamReader(is, "UTF-8"));
      PrintWriter w = new PrintWriter(new OutputStreamWriter(os, "UTF-8"));
      String line;
      while ((line = r.readLine())!= null) {
        w.println(line);
      }
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable if block.");
      } else {
        // This block should also never execute
        System.out.println("This is an unreachable else block.");
      }
      // Mutant code end
    } finally {
      is.close();
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}