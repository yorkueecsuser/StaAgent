import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class IO_APPENDING_TO_OBJECT_OUTPUT_STREAM {

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug1(File anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug1(String anyFile) throws Exception {
    OutputStream z = new FileOutputStream(anyFile, true);
    new ObjectOutputStream(z);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug2(File anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    out = new BufferedOutputStream(out);
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug2(String anyFile) throws Exception {
    OutputStream x = new FileOutputStream(anyFile, true);
    x = new BufferedOutputStream(x);
    new ObjectOutputStream(x);
  }

  @NoWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void notBug1(File anyFile) throws Exception {
    OutputStream y = new FileOutputStream(anyFile, false);
    new ObjectOutputStream(y);
  }
}