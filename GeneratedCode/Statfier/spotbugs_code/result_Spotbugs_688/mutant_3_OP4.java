import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class BadZipFileCreator {

  @ExpectWarning("AM_CREATES_EMPTY_ZIP_FILE_ENTRY")
  public static void main(String args[]) throws Exception {
    ZipOutputStream zipfile = new ZipOutputStream(new FileOutputStream("foo.zip"));
    for (int i = 0; i < args.length; i++) {
      ZipEntry e = new ZipEntry(args[i]);
      zipfile.putNextEntry(e);
      zipfile.closeEntry();

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never be printed because shouldRun is always false.");
      } else {
        System.out.println("This will also never be printed because shouldRun is always false.");
      }
    }
    zipfile.close();
  }

  // Method to simulate a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}