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
      r = new FileReader("testing.txt"); // Mutant: duplicated assignment
      r.read();
      r.close();
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
      reader = new BufferedReader(new FileReader("testing.txt")); // Mutant: duplicated assignment
      ignore(reader.read());
      reader.close();
    } catch (IOException e) {
    }
  }

  public void bufferedReaderClosed() throws IOException {
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("testing.txt"));
      reader = new BufferedReader(new FileReader("testing.txt")); // Mutant: duplicated assignment
      ignore(reader.read());
    } catch (IOException e) {
    } finally {
      if (reader!= null) reader.close();
    }
  }

  public void noNeedToCloseBufferReaderWrapperOk(File file) throws IOException {
    try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
      BufferedReader reader = new BufferedReader(inputStreamReader);
      reader = new BufferedReader(inputStreamReader); // Mutant: duplicated assignment
      ignore(reader.readLine());
    }
  }

  // InputStreamReader  tests

  public void inputStreamReaderNotClosedAfterRead() {
    InputStreamReader reader;
    try {
      reader = new InputStreamReader(new FileInputStream("testing.txt"));
      reader = new InputStreamReader(new FileInputStream("testing.txt")); // Mutant: duplicated assignment
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
  }

  public void inputStreamReaderClosed() throws IOException {
    InputStreamReader reader = null;
    try {
      reader = new InputStreamReader(new FileInputStream("testing.txt"));
      reader = new InputStreamReader(new FileInputStream("testing.txt")); // Mutant: duplicated assignment
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
      reader = new FileReader("testing.txt"); // Mutant: duplicated assignment
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
  }

  public void fileReaderClosed() throws IOException {
    FileReader reader = null;
    try {
      reader = new FileReader("testing.txt");
      reader = new FileReader("testing.txt"); // Mutant: duplicated assignment
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
      reader = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt"))); // Mutant: duplicated assignment
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
  }

  public void pushbackReaderClosed() throws IOException {
    PushbackReader reader = null;
    try {
      reader = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt")));
      reader = new PushbackReader(new InputStreamReader(new FileInputStream("testing.txt"))); // Mutant: duplicated assignment
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
      reader = new PipedReader(writer); // Mutant: duplicated assignment
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
  }

  public void pipedReaderNotClosedAfterConnect(PipedWriter writer) {
    PipedReader reader;
    try {
      reader = new PipedReader();
      reader.connect(writer);
      reader = new PipedReader(); // Mutant: duplicated assignment
      reader.connect(writer);
      reader.read();
      reader.close();
    } catch (IOException e) {
    }
  }

  public void pipedReaderNotConnected() {
    PipedReader reader;
    try {
      reader = new PipedReader();
      reader = new PipedReader(); // Mutant: duplicated assignment
      reader.close();
    } catch (IOException e) {
    }
  }

  public void pipedReaderClosed(PipedWriter writer) throws IOException {
    PipedReader reader = null;
    try {
      reader = new PipedReader();
      reader.connect(writer);
      reader = new PipedReader(); // Mutant: duplicated assignment
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
      reader = new PipedReader(writer); // Mutant: duplicated assignment
      reader.read();
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
  }
}