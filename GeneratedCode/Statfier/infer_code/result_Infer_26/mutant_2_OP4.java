import android.support.annotation.UiThread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class JavaIO {
  FileReader reader;
  DataInputStream inputStream;
  FileWriter writer;
  DataOutputStream outputStream;

  int doFileRead() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      int unreachableValue = 42;
    }
    return reader.read();
  }

  String doStreamRead() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      String unreachableString = "unreachable";
    }
    return inputStream.readUTF();
  }

  @UiThread
  void FN_fileReadBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    }
    doFileRead();
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is also unreachable");
    }
    doStreamRead();
  }

  @UiThread
  void writerMethodsOk() throws IOException {
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      writer.write('c');
    } else {
      // Some other unreachable code
      writer.write('d');
    }
  }

  @UiThread
  void readerMethodsOk() throws IOException {
    reader = new FileReader("bla");
    String enc = reader.getEncoding();
    reader.markSupported();
    reader.reset();
    reader.close();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      reader.mark(1);
    } else {
      // Some other unreachable code
      reader.skip(1);
    }
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      outputStream.write('b');
    } else {
      // Some other unreachable code
      outputStream.flush();
    }
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    inputStream.available();
    inputStream.reset();
    inputStream.close();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      inputStream.read();
    } else {
      // Some other unreachable code
      inputStream.skip(1);
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but always returns false
  }
}