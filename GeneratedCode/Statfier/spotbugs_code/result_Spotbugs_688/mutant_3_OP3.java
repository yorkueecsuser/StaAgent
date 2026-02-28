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

      // Introduced unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable statement.");
      }
    }
    zipfile.close();
  }

  private static boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}