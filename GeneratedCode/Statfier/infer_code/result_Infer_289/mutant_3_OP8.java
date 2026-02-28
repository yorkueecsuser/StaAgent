import android.support.annotation.UiThread;
import java.io.File;
import java.io.IOException;

class StrictModeViolation {
  File f;
  File g; // Mutated variable

  @UiThread
  void violateStrictModeBad() throws IOException {
    f.canRead();
    f.canWrite();
    f.createNewFile();
    f.createTempFile("a", "b");
    f.delete();
    f.getCanonicalPath();
    f.getFreeSpace();
    f.getTotalSpace();
    f.getUsableSpace();
    f.isDirectory();
    f.isFile();
    f.isHidden();
    f.lastModified();
    f.length();
    f.list();
    f.listFiles();
    f.mkdir();
    f.renameTo(f);
    f.setExecutable(true);
    f.setLastModified(1L);
    f.setReadable(true);
    f.setReadOnly();
    f.setWritable(true);

    // Mutated code
    g.canRead();
    g.canWrite();
    g.createNewFile();
    g.createTempFile("a", "b");
    g.delete();
    g.getCanonicalPath();
    g.getFreeSpace();
    g.getTotalSpace();
    g.getUsableSpace();
    g.isDirectory();
    g.isFile();
    g.isHidden();
    g.lastModified();
    g.length();
    g.list();
    g.listFiles();
    g.mkdir();
    g.renameTo(g);
    g.setExecutable(true);
    g.setLastModified(1L);
    g.setReadable(true);
    g.setReadOnly();
    g.setWritable(true);
  }
}