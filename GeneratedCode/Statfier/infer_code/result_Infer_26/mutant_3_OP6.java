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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return reader.read();
  }

  String doStreamRead() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return inputStream.readUTF();
  }

  @UiThread
  void FN_fileReadBad() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    doFileRead();
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    doStreamRead();
  }

  @UiThread
  void writerMethodsOk() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
  }

  @UiThread
  void readerMethodsOk() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    reader = new FileReader("bla");
    String enc = reader.getEncoding();
    reader.markSupported();
    reader.reset();
    reader.close();
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    outputStream.write('a');
    outputStream.size();
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    inputStream.available();
    inputStream.reset();
    inputStream.close();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}