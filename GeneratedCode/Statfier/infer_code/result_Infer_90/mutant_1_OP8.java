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
  }
  
  // Mutant
  public void readerNotClosedAfterRead_mutant() {
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
  }
  
  // Mutant
  public void bufferedReaderNotClosedAfterRead_mutant() {
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
  }

  public void noNeedToCloseBufferReaderWrapperOk(File file) throws IOException {
    try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
      BufferedReader reader = new BufferedReader(inputStreamReader);
      ignore(reader.readLine());
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
  }
  
  // Mutant
  public void inputStreamReaderNotClosedAfterRead_mutant() {
    InputStreamReader z;
    try {
      z = new InputStreamReader(new FileInputStream("testing.txt"));
      z.read();
      z.close();
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
  }
  
  // Mutant
  public void fileReaderNotClosedAfterRead_mutant() {
    FileReader w;
    try {
      w = new FileReader("testing.txt");
      w.read();
      w.close();
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
  }
  
  // Mutant
  public void pushbackReaderNotClosedAfterRead_mutant() {
    PushbackReader v;
    try {
      v = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt")));
      v.read();
      v.close();
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
  }
  
  // Mutant
  public void pipedReaderNotClosedAfterConstructedWithWriter_mutant() {
    PipedReader t;
    PipedWriter s;
    try {
      s = new PipedWriter();
      t = new PipedReader(s);
      t.read();
      t.close();
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
  }
  
  // Mutant
  public void pipedReaderNotClosedAfterConnect_mutant(PipedWriter writer) {
    PipedReader u;
    try {
      u = new PipedReader();
      u.connect(writer);
      u.read();
      u.close();
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
  }
  
  // Mutant
  public void pipedReaderNotConnected_mutant() {
    PipedReader q;
    try {
      q = new PipedReader();
      q.close();
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
  }
}