import android.support.annotation.UiThread;
import java.io.File;
import java.io.IOException;

class StrictModeViolation {
  File f;

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

    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}