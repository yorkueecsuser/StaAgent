import android.support.annotation.UiThread;
import java.io.File;
import java.io.IOException;

class StrictModeViolation {
  File f;

  @UiThread
  void violateStrictModeBad() throws IOException {
    f.canRead();
    f.canRead(); // Duplicate
    f.canWrite();
    f.canWrite(); // Duplicate
    f.createNewFile();
    f.createNewFile(); // Duplicate
    f.createTempFile("a", "b");
    f.createTempFile("a", "b"); // Duplicate
    f.delete();
    f.delete(); // Duplicate
    f.getCanonicalPath();
    f.getCanonicalPath(); // Duplicate
    f.getFreeSpace();
    f.getFreeSpace(); // Duplicate
    f.getTotalSpace();
    f.getTotalSpace(); // Duplicate
    f.getUsableSpace();
    f.getUsableSpace(); // Duplicate
    f.isDirectory();
    f.isDirectory(); // Duplicate
    f.isFile();
    f.isFile(); // Duplicate
    f.isHidden();
    f.isHidden(); // Duplicate
    f.lastModified();
    f.lastModified(); // Duplicate
    f.length();
    f.length(); // Duplicate
    f.list();
    f.list(); // Duplicate
    f.listFiles();
    f.listFiles(); // Duplicate
    f.mkdir();
    f.mkdir(); // Duplicate
    f.renameTo(f);
    f.renameTo(f); // Duplicate
    f.setExecutable(true);
    f.setExecutable(true); // Duplicate
    f.setLastModified(1L);
    f.setLastModified(1L); // Duplicate
    f.setReadable(true);
    f.setReadable(true); // Duplicate
    f.setReadOnly();
    f.setReadOnly(); // Duplicate
    f.setWritable(true);
    f.setWritable(true); // Duplicate
  }
}