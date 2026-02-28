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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void noNeedToCloseBufferReaderWrapperOk(File file) throws IOException {
    try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
      BufferedReader reader = new BufferedReader(inputStreamReader);
      ignore(reader.readLine());
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void pipedReaderNotConnected() {
    PipedReader reader;
    try {
      reader = new PipedReader();
      reader.close();
    } catch (IOException e) {
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}