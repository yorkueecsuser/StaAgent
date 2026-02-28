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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      return reader.read();
    }
  }

  String doStreamRead() throws IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      return inputStream.readUTF();
    }
  }

  @UiThread
  void FN_fileReadBad() throws IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      doFileRead();
    }
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      doStreamRead();
    }
  }

  @UiThread
  void writerMethodsOk() throws IOException {
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      // No additional code needed here
    }
  }

  @UiThread
  void readerMethodsOk() throws IOException {
    reader = new FileReader("bla");
    String enc = reader.getEncoding();
    reader.markSupported();
    reader.reset();
    reader.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      // No additional code needed here
    }
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      // No additional code needed here
    }
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    inputStream.available();
    inputStream.reset();
    inputStream.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some additional code that should never run
      System.out.println("This is an unreachable code block.");
    } else {
      // This is the actual path that will run
      // No additional code needed here
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}