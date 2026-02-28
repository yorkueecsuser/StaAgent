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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
  }

  @UiThread
  void readerMethodsOk() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    reader = new FileReader("bla");
    String enc = reader.getEncoding();
    reader.markSupported();
    reader.reset();
    reader.close();
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    outputStream.write('a');
    outputStream.size();
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    inputStream.available();
    inputStream.reset();
    inputStream.close();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime, making the if statement unreachable.
  }
}