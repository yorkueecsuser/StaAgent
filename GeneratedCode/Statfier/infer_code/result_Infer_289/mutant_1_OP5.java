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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code.");
        break;
      default:
        // Default case to ensure switch is not empty and always false evaluates to this
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}