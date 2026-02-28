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

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block.");
    } else {
      // Alternative block that will always execute
      System.out.println("This block will always execute.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}