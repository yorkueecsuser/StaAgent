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
    // Mutant
    Writer x;
    try {
      x = new PrintWriter("file.txt");
      x.write(10);
      x.close();
    } catch (IOException e) {
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
    // Mutant
    Writer y = null;
    try {
      y = new PrintWriter("file.txt");
      y.write(10);
    } catch (IOException e) {
    } finally {
      if (y!= null) y.close();
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
    // Mutant
    PrintWriter z;
    try {
      z = new PrintWriter("file.txt");
      z = z.append('0');
      z.close();
    } catch (IOException e) {
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
    // Mutant
    PrintWriter a = null;
    try {
      a = new PrintWriter("file.txt");
      a = a.append(null);
    } catch (IOException e) {
    } finally {
      if (a!= null) a.close();
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
    // Mutant
    BufferedWriter b;
    try {
      FileWriter fw = new FileWriter("file.txt");
      b = new BufferedWriter(fw);
      b.write("word");
      b.close();
    } catch (IOException e) {
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
    // Mutant
    BufferedWriter c = null;
    try {
      FileWriter fw = new FileWriter("file.txt");
      c = new BufferedWriter(fw);
      c.flush();
    } catch (IOException e) {
    } finally {
      if (c!= null) c.close();
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
    // Mutant
    OutputStreamWriter d;
    try {
      d = new OutputStreamWriter(new FileOutputStream("file.txt"));
      d.write("word");
      d.close();
    } catch (IOException e) {
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
    // Mutant
    OutputStreamWriter e = null;
    try {
      e = new OutputStreamWriter(new FileOutputStream("file.txt"));
      e.write(10);
    } catch (IOException e1) {
    } finally {
      if (e!= null) e.close();
    }
  }

  // FileWriter tests

  public void fileWriterNotClosedAfterWrite() {
    FileWriter writer;
    try {
      writer = new FileWriter("file.txt");
      writer.write("word");
      writer.close();
    } catch (IOException f) {
    }
    // Mutant
    FileWriter g;
    try {
      g = new FileWriter("file.txt");
      g.write("word");
      g.close();
    } catch (IOException f1) {
    }
  }

  public void fileWriterClosed() throws IOException {
    FileWriter writer = null;
    try {
      writer = new FileWriter("file.txt");
      writer.write(10);
    } catch (IOException f) {
    } finally {
      if (writer!= null) writer.close();
    }
    // Mutant
    FileWriter h = null;
    try {
      h = new FileWriter("file.txt");
      h.write(10);
    } catch (IOException f1) {
    } finally {
      if (h!= null) h.close();
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
    } catch (IOException i) {
    }
    // Mutant
    PipedWriter j;
    PipedReader k;
    try {
      k = new PipedReader();
      j = new PipedWriter(k);
      j.write(42);
      j.close();
    } catch (IOException i1) {
    }
  }

  public void pipedWriterNotClosedAfterConnect(PipedReader reader) {
    PipedWriter writer;
    try {
      writer = new PipedWriter();
      writer.connect(reader);
      writer.write(42);
      writer.close();
    } catch (IOException l) {
    }
    // Mutant
    PipedWriter m;
    try {
      m = new PipedWriter();
      m.connect(reader);
      m.write(42);
      m.close();
    } catch (IOException l1) {
    }
  }

  public void pipedWriterNotConnected() {
    PipedWriter writer;
    try {
      writer = new PipedWriter();
      writer.close();
    } catch (IOException n) {
    }
    // Mutant
    PipedWriter o;
    try {
      o = new PipedWriter();
      o.close();
    } catch (IOException n1) {
    }
  }

  public void pipedWriterClosed(PipedReader reader) throws IOException {
    PipedWriter writer = null;
    try {
      writer = new PipedWriter();
      writer.connect(reader);
      writer.write(42);
    } catch (IOException p) {
    } finally {
      if (writer!= null) writer.close();
    }
    // Mutant
    PipedWriter q = null;
    try {
      q = new PipedWriter();
      q.connect(reader);
      q.write(42);
    } catch (IOException p1) {
    } finally {
      if (q!= null) q.close();
    }
  }
}