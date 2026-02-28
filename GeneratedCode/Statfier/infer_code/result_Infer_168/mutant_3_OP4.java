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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write(20);
    } else {
      // Another unreachable code
      writer.write(30);
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write(20);
    } else {
      // Another unreachable code
      writer.write(30);
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.append('1');
    } else {
      // Another unreachable code
      writer.append('2');
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.append('1');
    } else {
      // Another unreachable code
      writer.append('2');
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write("more words");
    } else {
      // Another unreachable code
      writer.write("even more words");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write("more words");
    } else {
      // Another unreachable code
      writer.write("even more words");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write("more words");
    } else {
      // Another unreachable code
      writer.write("even more words");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write("more words");
    } else {
      // Another unreachable code
      writer.write("even more words");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write("more words");
    } else {
      // Another unreachable code
      writer.write("even more words");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write("more words");
    } else {
      // Another unreachable code
      writer.write("even more words");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write(50);
    } else {
      // Another unreachable code
      writer.write(60);
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write(50);
    } else {
      // Another unreachable code
      writer.write(60);
    }
  }

  public void pipedWriterNotConnected() {
    PipedWriter writer;
    try {
      writer = new PipedWriter();
      writer.close();
    } catch (IOException e) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write(50);
    } else {
      // Another unreachable code
      writer.write(60);
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write(50);
    } else {
      // Another unreachable code
      writer.write(60);
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}