import android.support.annotation.UiThread;
import java.io.File;
import java.io.IOException;

class StrictModeViolation {
  File f;

  @UiThread
  void violateStrictModeBad() throws IOException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
    }

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
  }

  private boolean getCondition() {
    return false;
  }
}