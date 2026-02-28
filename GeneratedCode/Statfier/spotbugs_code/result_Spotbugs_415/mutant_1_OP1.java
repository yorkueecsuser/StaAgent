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
    String qzjfnxrd; // Dead store
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug1(String anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    int vbnrhtyf; // Dead store
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug2(File anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    out = new BufferedOutputStream(out);
    double wqejkxzc; // Dead store
    new ObjectOutputStream(out);
  }

  @ExpectWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void bug2(String anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, true);
    out = new BufferedOutputStream(out);
    boolean lmnopqrs; // Dead store
    new ObjectOutputStream(out);
  }

  @NoWarning("IO_APPENDING_TO_OBJECT_OUTPUT_STREAM")
  void notBug1(File anyFile) throws Exception {
    OutputStream out = new FileOutputStream(anyFile, false);
    char tuvwxyzp; // Dead store
    new ObjectOutputStream(out);
  }
}