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
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    return reader.read();
  }

  String doStreamRead() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    return inputStream.readUTF();
  }

  @UiThread
  void FN_fileReadBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    doFileRead();
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
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
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
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
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    inputStream.available();
    inputStream.reset();
    inputStream.close();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}