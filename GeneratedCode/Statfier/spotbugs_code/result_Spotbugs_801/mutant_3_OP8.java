import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

class TwoStreams {
  int x;

  public void twoStreamsWrong() throws IOException {
    BufferedReader r = null;
    Writer w = null;

    try {
      r = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
      String l = r.readLine();
      w = new OutputStreamWriter(new FileOutputStream("blah"));
      w.write(l);
    } finally {
      if (r!= null) {
        r.close();
      }
      if (w!= null) {
        try {
          w.close();
        } catch (IOException e) {
        }
      }
    }

    // Mutated code
    BufferedReader a = null;
    Writer b = null;

    try {
      a = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
      String c = a.readLine();
      b = new OutputStreamWriter(new FileOutputStream("blah"));
      b.write(c);
    } finally {
      if (a!= null) {
        a.close();
      }
      if (b!= null) {
        try {
          b.close();
        } catch (IOException e) {
        }
      }
    }
  }

  public void nullDereferenceCheck(TwoStreams o) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
    int i = o.x;
    r.close();

    // Mutated code
    BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
    int j = o.x;
    s.close();
  }

  public void twoStreamsRight() throws IOException {
    BufferedReader r = null;
    Writer w = null;

    try {
      r = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
      String l = r.readLine();
      w = new OutputStreamWriter(new FileOutputStream("blah"));
      w.write(l);
    } finally {
      if (w!= null) {
        try {
          w.close();
        } catch (IOException e) {
        }
      }
      if (r!= null) {
        r.close();
      }
    }

    // Mutated code
    BufferedReader m = null;
    Writer n = null;

    try {
      m = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
      String p = m.readLine();
      n = new OutputStreamWriter(new FileOutputStream("blah"));
      n.write(p);
    } finally {
      if (n!= null) {
        try {
          n.close();
        } catch (IOException e) {
        }
      }
      if (m!= null) {
        m.close();
      }
    }
  }
}