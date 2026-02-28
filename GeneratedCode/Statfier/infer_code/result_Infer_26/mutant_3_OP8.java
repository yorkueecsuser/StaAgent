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
  }

  @UiThread
  void FN_streamReadBad() throws IOException {
    doStreamRead();
  }

  @UiThread
  void writerMethodsOk() throws IOException {
    writer = new FileWriter("bla");
    writer.write('a');
    writer.append('b');
    String enc = writer.getEncoding();
  }

  @UiThread
  void readerMethodsOk() throws IOException {
    reader = new FileReader("bla");
    String enc = reader.getEncoding();
    reader.markSupported();
    reader.reset();
    reader.close();
  }

  @UiThread
  void outputStreamMethodsOk() throws IOException {
    outputStream.write('a');
    outputStream.size();
  }

  @UiThread
  void inputStreamMethodsOk() throws IOException {
    inputStream.available();
    inputStream.reset();
    inputStream.close();
  }

  // Mutated code
  FileReader x;
  DataInputStream y;
  FileWriter z;
  DataOutputStream w;

  int doFileReadMutant() throws IOException {
    return x.read();
  }

  String doStreamReadMutant() throws IOException {
    return y.readUTF();
  }

  @UiThread
  void FN_fileReadBadMutant() throws IOException {
    doFileReadMutant();
  }

  @UiThread
  void FN_streamReadBadMutant() throws IOException {
    doStreamReadMutant();
  }

  @UiThread
  void writerMethodsOkMutant() throws IOException {
    z = new FileWriter("bla");
    z.write('a');
    z.append('b');
    String enc = z.getEncoding();
  }

  @UiThread
  void readerMethodsOkMutant() throws IOException {
    x = new FileReader("bla");
    String enc = x.getEncoding();
    x.markSupported();
    x.reset();
    x.close();
  }

  @UiThread
  void outputStreamMethodsOkMutant() throws IOException {
    w.write('a');
    w.size();
  }

  @UiThread
  void inputStreamMethodsOkMutant() throws IOException {
    y.available();
    y.reset();
    y.close();
  }
}