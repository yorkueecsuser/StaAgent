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
    InputStream a = new FileInputStream("test.txt");
    OutputStream b = new FileOutputStream("/tmp/test.txt");
    try {
      BufferedReader c = new BufferedReader(new InputStreamReader(a, "UTF-8"));
      PrintWriter d = new PrintWriter(new OutputStreamWriter(b, "UTF-8"));
      String e;
      while ((e = c.readLine())!= null) {
        d.println(e);
      }
    } finally {
      a.close();
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
    InputStream f = new FileInputStream("test.txt");
    OutputStream g = new FileOutputStream("/tmp/test.txt");
    try {
      BufferedReader h = new BufferedReader(new InputStreamReader(f, "UTF-8"));
      PrintWriter i = new PrintWriter(new OutputStreamWriter(g, "UTF-8"));
      String j;
      while ((j = h.readLine())!= null) {
        i.println(j);
      }
    } finally {
      f.close();
    }
  }
}