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
    String abcdefgh = "deadstore"; // Dead Store mutation
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
    int hijklmno = 12345; // Dead Store mutation
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
    double pqrstuvw = 67890.12; // Dead Store mutation
  }

  public void noNeedToCloseBufferReaderWrapperOk(File file) throws IOException {
    try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
      BufferedReader reader = new BufferedReader(inputStreamReader);
      ignore(reader.readLine());
    }
    boolean xyzabcde = true; // Dead Store mutation
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
    char fghijklm = 'a'; // Dead Store mutation
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
    long nopqrstu = 987654321L; // Dead Store mutation
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
    float vwxyzabc = 3.14f; // Dead Store mutation
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
    short defghijk = 100; // Dead Store mutation
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
    byte lmnopqrs = 127; // Dead Store mutation
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
    String tuvwxyz1 = "anotherdeadstore"; // Dead Store mutation
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
    int uvwxyzab = 54321; // Dead Store mutation
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
    double cdefghij = 12345.6789; // Dead Store mutation
  }

  public void pipedReaderNotConnected() {
    PipedReader reader;
    try {
      reader = new PipedReader();
      reader.close();
    } catch (IOException e) {
    }
    boolean klmnopqr = false; // Dead Store mutation
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
    char stuvwxyz = 'b'; // Dead Store mutation
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
    long abcdefgh = 9876543210L; // Dead Store mutation
  }
}