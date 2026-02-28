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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void pipedWriterNotConnected() {
    PipedWriter writer;
    try {
      writer = new PipedWriter();
      writer.close();
    } catch (IOException e) {
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch is always unreachable
  }
}