import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PushbackReader;
import java.io.Reader;

class ReaderLeaks {

  private void ignore(Object o) {}

  // Reader  tests

  public void readerNotClosedAfterRead() {
    Reader r;
    try {
      r = new FileReader("testing.txt");
      r.read();
      r.close();
    } catch (IOException e) {
    }
    // Mutant
    Reader x;
    try {
      x = new FileReader("testing.txt");
      x.read();
      x.close();
    } catch (IOException e) {
    }
  }
  /* This test seems to be flaky in the CI at the moment.
    We guess it's because of timeouts in the analysis.
    public void readerClosedOk() throws IOException {
      Reader r = null;
      try {
        r = new FileReader("testing.txt");
        boolean ready = r.ready();
        r.close();
      } catch (IOException e) {
      } finally {
        if (r!= null) r.close();
      }
    }
  */
  // BufferedReader  tests

  public void bufferedReaderNotClosedAfterRead() {
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader("testing.txt"));
      ignore(reader.read());
      reader.close();
    } catch (IOException e) {
    }
    // Mutant
    BufferedReader y;
    try {
      y = new BufferedReader(new FileReader("testing.txt"));
      ignore(y.read());
      y.close();
    } catch (IOException e) {
    }
  }

  public void bufferedReaderClosed() throws IOException {
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("testing.txt"));
      ignore(reader.read());
    } catch (IOException e) {
    } finally {
      if (reader!= null) reader.close();
    }
    // Mutant
    BufferedReader z = null;
    try {
      z = new BufferedReader(new FileReader("testing.txt"));
      ignore(z.read());
    } catch (IOException e) {
    } finally {
      if (z!= null) z.close();
    }
  }

  public void noNeedToCloseBufferReaderWrapperOk(File file) throws IOException {
    try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
      BufferedReader reader = new BufferedReader(inputStreamReader);
      ignore(reader.readLine());
    }
    // Mutant
    try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
      BufferedReader w = new BufferedReader(inputStreamReader);
      ignore(w.readLine());
    }
  }

  // InputStreamReader  tests

  public void inputStreamReaderNotClosedAfterRead() {
    InputStreamReader reader;
    try {
      reader = new InputStreamReader(new FileInputStream("testing.txt"));
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
    // Mutant
    InputStreamReader v;
    try {
      v = new InputStreamReader(new FileInputStream("testing.txt"));
      v.read();
      v.close();
    } catch (IOException e) {
    }
  }

  public void inputStreamReaderClosed() throws IOException {
    InputStreamReader reader = null;
    try {
      reader = new InputStreamReader(new FileInputStream("testing.txt"));
      ignore(reader.read());
    } catch (IOException e) {
    } finally {
      if (reader!= null) reader.close();
    }
    // Mutant
    InputStreamReader u = null;
    try {
      u = new InputStreamReader(new FileInputStream("testing.txt"));
      ignore(u.read());
    } catch (IOException e) {
    } finally {
      if (u!= null) u.close();
    }
  }

  // FileReader  tests

  public void fileReaderNotClosedAfterRead() {
    FileReader reader;
    try {
      reader = new FileReader("testing.txt");
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
    // Mutant
    FileReader t;
    try {
      t = new FileReader("testing.txt");
      t.read();
      t.close();
    } catch (IOException e) {
    }
  }

  public void fileReaderClosed() throws IOException {
    FileReader reader = null;
    try {
      reader = new FileReader("testing.txt");
      reader.read();
    } catch (IOException e) {
    } finally {
      if (reader!= null) reader.close();
    }
    // Mutant
    FileReader s = null;
    try {
      s = new FileReader("testing.txt");
      s.read();
    } catch (IOException e) {
    } finally {
      if (s!= null) s.close();
    }
  }

  // PushbackReader  tests

  public void pushbackReaderNotClosedAfterRead() {
    PushbackReader reader;
    try {
      reader = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt")));
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
    // Mutant
    PushbackReader q;
    try {
      q = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt")));
      q.read();
      q.close();
    } catch (IOException e) {
    }
  }

  public void pushbackReaderClosed() throws IOException {
    PushbackReader reader = null;
    try {
      reader = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt")));
      reader.read();
    } catch (IOException e) {
    } finally {
      if (reader!= null) reader.close();
    }
    // Mutant
    PushbackReader p = null;
    try {
      p = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt")));
      p.read();
    } catch (IOException e) {
    } finally {
      if (p!= null) p.close();
    }
  }

  // PipedReader tests

  public void pipedReaderNotClosedAfterConstructedWithWriter() {
    PipedReader reader;
    PipedWriter writer;
    try {
      writer = new PipedWriter();
      reader = new PipedReader(writer);
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
    // Mutant
    PipedReader o;
    PipedWriter n;
    try {
      n = new PipedWriter();
      o = new PipedReader(n);
      o.read();
      o.close();
    } catch (IOException e) {
    }
  }

  public void pipedReaderNotClosedAfterConnect(PipedWriter writer) {
    PipedReader reader;
    try {
      reader = new PipedReader();
      reader.connect(writer);
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
    // Mutant
    PipedReader m;
    try {
      m = new PipedReader();
      m.connect(writer);
      m.read();
      m.close();
    } catch (IOException e) {
    }
  }

  public void pipedReaderNotConnected() {
    PipedReader reader;
    try {
      reader = new PipedReader();
      reader.close();
    } catch (IOException e) {
    }
    // Mutant
    PipedReader l;
    try {
      l = new PipedReader();
      l.close();
    } catch (IOException e) {
    }
  }

  public void pipedReaderClosed(PipedWriter writer) throws IOException {
    PipedReader reader = null;
    try {
      reader = new PipedReader();
      reader.connect(writer);
      reader.read();
    } catch (IOException e) {
    } finally {
      if (reader!= null) reader.close();
    }
    // Mutant
    PipedReader k = null;
    try {
      k = new PipedReader();
      k.connect(writer);
      k.read();
    } catch (IOException e) {
    } finally {
      if (k!= null) k.close();
    }
  }

  public void pipedReaderFalsePositive() throws IOException {
    PipedReader reader;
    PipedWriter writer = null;
    try {
      reader = new PipedReader(writer);
      reader.read();
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
    // Mutant
    PipedReader j;
    PipedWriter i = null;
    try {
      j = new PipedReader(i);
      j.read();
    } catch (IOException e) {
    } finally {
      if (i!= null) i.close();
    }
  }
}