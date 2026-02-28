import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.Writer;

class WriterLeaks {

  // Writer tests

  public void writerNotClosedAfterWrite() {
    Writer writer;
    try {
      writer = new PrintWriter("file.txt");
      writer.write(10);
      writer.close();
    } catch (IOException e) {
    }
    String abcdefgh = "unused"; // Dead store
  }

  public void writerClosed() throws IOException {
    Writer writer = null;
    try {
      writer = new PrintWriter("file.txt");
      writer.write(10);
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
    int hijklmno = 42; // Dead store
  }

  // PrintWriter tests

  public void printWriterNotClosedAfterAppend() {
    PrintWriter writer;
    try {
      writer = new PrintWriter("file.txt");
      writer = writer.append('0');
      writer.close();
    } catch (IOException e) {
    }
    double pqrstuvw = 3.14; // Dead store
  }

  public void printWriterClosed() throws IOException {
    PrintWriter writer = null;
    try {
      writer = new PrintWriter("file.txt");
      writer = writer.append(null);
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
    char xyzabcde = 'x'; // Dead store
  }

  // BufferedWriter tests

  public void bufferedWriterNotClosedAfterWrite() {
    BufferedWriter writer;
    try {
      FileWriter fw = new FileWriter("file.txt");
      writer = new BufferedWriter(fw);
      writer.write("word");
      writer.close();
    } catch (IOException e) {
    }
    boolean fghijklm = true; // Dead store
  }

  public void bufferedWriterClosed() throws IOException {
    BufferedWriter writer = null;
    try {
      FileWriter fw = new FileWriter("file.txt");
      writer = new BufferedWriter(fw);
      writer.flush();
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
    long nopqrstu = 123456789L; // Dead store
  }

  // OutputStreamWriter tests

  public void outputStreamWriterNotClosedAfterWrite() {
    OutputStreamWriter writer;
    try {
      writer = new OutputStreamWriter(new FileOutputStream("file.txt"));
      writer.write("word");
      writer.close();
    } catch (IOException e) {
    }
    float vwxyzabc = 2.71f; // Dead store
  }

  public void outputStreamWriterClosed() throws IOException {
    OutputStreamWriter writer = null;
    try {
      writer = new OutputStreamWriter(new FileOutputStream("file.txt"));
      writer.write(10);
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
    short defghijk = 100; // Dead store
  }

  // FileWriter tests

  public void fileWriterNotClosedAfterWrite() {
    FileWriter writer;
    try {
      writer = new FileWriter("file.txt");
      writer.write("word");
      writer.close();
    } catch (IOException e) {
    }
    byte lmnopqrs = 10; // Dead store
  }

  public void fileWriterClosed() throws IOException {
    FileWriter writer = null;
    try {
      writer = new FileWriter("file.txt");
      writer.write(10);
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
    char tuvwxyzA = 'y'; // Dead store
  }

  // PipedWriter tests

  public void pipedWriterNotClosedAfterConstructedWithReader() {
    PipedWriter writer;
    PipedReader reader;
    try {
      reader = new PipedReader();
      writer = new PipedWriter(reader);
      writer.write(42);
      writer.close();
    } catch (IOException e) {
    }
    int bcdefghi = 99; // Dead store
  }

  public void pipedWriterNotClosedAfterConnect(PipedReader reader) {
    PipedWriter writer;
    try {
      writer = new PipedWriter();
      writer.connect(reader);
      writer.write(42);
      writer.close();
    } catch (IOException e) {
    }
    double jklmnopq = 1.618; // Dead store
  }

  public void pipedWriterNotConnected() {
    PipedWriter writer;
    try {
      writer = new PipedWriter();
      writer.close();
    } catch (IOException e) {
    }
    String rstuvwxY = "another unused"; // Dead store
  }

  public void pipedWriterClosed(PipedReader reader) throws IOException {
    PipedWriter writer = null;
    try {
      writer = new PipedWriter();
      writer.connect(reader);
      writer.write(42);
    } catch (IOException e) {
    } finally {
      if (writer!= null) writer.close();
    }
    long zabcdefghi = 987654321L; // Dead store
  }
}