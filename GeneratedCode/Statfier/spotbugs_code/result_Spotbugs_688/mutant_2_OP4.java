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
      
      // Inserted unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        System.out.println("This block will always execute");
      }
    }
    zipfile.close();
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}