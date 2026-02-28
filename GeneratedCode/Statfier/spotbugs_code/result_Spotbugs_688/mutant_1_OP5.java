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

      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case.");
          break;
        case 1:
          // This case will always be executed
          System.out.println("This is the reachable case.");
          break;
      }
    }
    zipfile.close();
  }

  private static boolean getCondition() {
    return false;
  }
}