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
    // Dead Store Mutation
    String qvbnrhty = "unused";
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    doStreamRead();
    // Dead Store Mutation
    int kxwzvfpo = 42;
  }

  @UiThread
  void writerMethodsOk() throws IOException {
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
    // Dead Store Mutation
    boolean ytrjhgfd = false;
  }

  @UiThread
  void readerMethodsOk() throws IOException {
    reader = new FileReader("bla");
    String enc = reader.getEncoding();
    reader.markSupported();
    reader.reset();
    reader.close();
    // Dead Store Mutation
    char vbnrhtyu = 'x';
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
    // Dead Store Mutation
    double qwertyui = 3.14;
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    inputStream.available();
    inputStream.reset();
    inputStream.close();
    // Dead Store Mutation
    long asdfghjk = 1234567890L;
  }
}