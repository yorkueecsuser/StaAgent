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
    // Dead Store Mutation
    String qzjxvbgt = "unusedString";
  }

  String doStreamRead() throws IOException {
    return inputStream.readUTF();
    // Dead Store Mutation
    int wertypoi = 42;
  }

  @UiThread
  void FN_fileReadBad() throws IOException {
    doFileRead();
    // Dead Store Mutation
    boolean rtyujhgf = false;
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    doStreamRead();
    // Dead Store Mutation
    char asdfghjk = 'c';
  }

  @UiThread
  void writerMethodsOk() throws IOException {
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
    // Dead Store Mutation
    double zxcvbnml = 3.14;
  }

  @UiThread
  void readerMethodsOk() throws IOException {
    reader = new FileReader("bla");
    String enc = reader.getEncoding();
    reader.markSupported();
    reader.reset();
    reader.close();
    // Dead Store Mutation
    long poiuytrewq = 987654321L;
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
    // Dead Store Mutation
    float lkjhgfds = 2.718f;
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    inputStream.available();
    inputStream.reset();
    inputStream.close();
    // Dead Store Mutation
    short mnbgvfcd = 12345;
  }
}