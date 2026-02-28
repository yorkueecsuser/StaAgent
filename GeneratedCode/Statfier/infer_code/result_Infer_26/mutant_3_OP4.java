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
      int dummy = 0;
    }
    return reader.read();
  }

  String doStreamRead() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      String dummy = "";
    }
    return inputStream.readUTF();
  }

  @UiThread
  void FN_fileReadBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      int dummy = 0;
    }
    doFileRead();
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      String dummy = "";
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
      int dummy = 0;
    } else {
      // Some other unreachable code
      String dummyStr = "";
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
      int dummy = 0;
    } else {
      // Some other unreachable code
      String dummyStr = "";
    }
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      int dummy = 0;
    } else {
      // Some other unreachable code
      String dummyStr = "";
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
      int dummy = 0;
    } else {
      // Some other unreachable code
      String dummyStr = "";
    }
  }

  private boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    return false; // This is just a placeholder; in a real scenario, this should be dynamic
  }
}