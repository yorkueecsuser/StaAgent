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
    } finally {
      is.close();
    }

    // Mutant code
    InputStream xs = new FileInputStream("test.txt");
    OutputStream ys = new FileOutputStream("/tmp/test.txt");
    try {
      BufferedReader q = new BufferedReader(new InputStreamReader(xs, "UTF-8"));
      PrintWriter v = new PrintWriter(new OutputStreamWriter(ys, "UTF-8"));
      String txt;
      while ((txt = q.readLine())!= null) {
        v.println(txt);
      }
    } finally {
      xs.close();
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
    } finally {
      is.close();
    }

    // Mutant code
    InputStream xs = new FileInputStream("test.txt");
    OutputStream ys = new FileOutputStream("/tmp/test.txt");
    try {
      BufferedReader q = new BufferedReader(new InputStreamReader(xs, "UTF-8"));
      PrintWriter v = new PrintWriter(new OutputStreamWriter(ys, "UTF-8"));
      String txt;
      while ((txt = q.readLine())!= null) {
        v.println(txt);
      }
    } finally {
      xs.close();
    }
  }
}