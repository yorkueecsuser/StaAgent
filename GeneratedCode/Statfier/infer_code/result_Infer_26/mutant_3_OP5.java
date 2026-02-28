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
    return reader.read();
  }

  String doStreamRead() throws IOException {
    return inputStream.readUTF();
  }

  @UiThread
  void FN_fileReadBad() throws IOException {
    doFileRead();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left blank to make the switch statement unreachable
        break;
    }
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    doStreamRead();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left blank to make the switch statement unreachable
        break;
    }
  }

  @UiThread
  void writerMethodsOk() throws IOException {
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left blank to make the switch statement unreachable
        break;
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
    switch(condition) {
      case true:
        // This case is intentionally left blank to make the switch statement unreachable
        break;
    }
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left blank to make the switch statement unreachable
        break;
    }
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    inputStream.available();
    inputStream.reset();
    inputStream.close();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left blank to make the switch statement unreachable
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}