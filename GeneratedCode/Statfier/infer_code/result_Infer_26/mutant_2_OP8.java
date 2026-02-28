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

  // Mutated code starts here

  int doFileReadMutant() throws IOException {
    return reader.read();
  }

  String doStreamReadMutant() throws IOException {
    return inputStream.readUTF();
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
    FileWriter w = new FileWriter("bla");
    w.write('a');
    w.append('b');
    String e = w.getEncoding();
  }

  @UiThread
  void readerMethodsOkMutant() throws IOException {
    FileReader r = new FileReader("bla");
    String e = r.getEncoding();
    r.markSupported();
    r.reset();
    r.close();
  }

  @UiThread
  void outputStreamMethodsOkMutant() throws IOException {
    DataOutputStream o = outputStream;
    o.write('a');
    o.size();
  }

  @UiThread
  void inputStreamMethodsOkMutant() throws IOException {
    DataInputStream i = inputStream;
    i.available();
    i.reset();
    i.close();
  }
}