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
    }
    zipfile.close();

    // Mutant code
    int x = 0;
    for (int j = 0; j < args.length; j++) {
      ZipEntry f = new ZipEntry(args[j]);
      zipfile.putNextEntry(f);
      zipfile.closeEntry();
    }
    zipfile.close();
  }
}