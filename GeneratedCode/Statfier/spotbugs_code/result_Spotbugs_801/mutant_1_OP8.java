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

    // Mutant: Renaming variable 'r' to 'a'
    BufferedReader a = null;
    try {
      a = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
      String l = a.readLine();
      w = new OutputStreamWriter(new FileOutputStream("blah"));
      w.write(l);
    } finally {
      if (a!= null) {
        a.close();
      }
      if (w!= null) {
        try {
          w.close();
        } catch (IOException e) {
        }
      }
    }
  }

  public void nullDereferenceCheck(TwoStreams o) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
    int i = o.x;
    r.close();

    // Mutant: Renaming variable 'i' to 'b'
    BufferedReader c = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
    int b = o.x;
    c.close();
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

    // Mutant: Renaming variable 'w' to 'd'
    BufferedReader e = null;
    Writer d = null;
    try {
      e = new BufferedReader(new InputStreamReader(new FileInputStream("hello")));
      String l = e.readLine();
      d = new OutputStreamWriter(new FileOutputStream("blah"));
      d.write(l);
    } finally {
      if (d!= null) {
        try {
          d.close();
        } catch (IOException e1) {
        }
      }
      if (e!= null) {
        e.close();
      }
    }
  }
}