import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Bug1779315 {
  private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  private static final DateFormat dateFormatCopy = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"); // Duplicate assignment

  private static final DateFormat alternativeDateFormat =
      new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
  private static final DateFormat alternativeDateFormatCopy =
      new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss"); // Duplicate assignment

  public void testFilesMethods() throws IOException {
    File f = new File("blah.txt");
    File fCopy = new File("blah.txt"); // Duplicate assignment
    File f2 = new File("blah2.txt");
    File f2Copy = new File("blah2.txt"); // Duplicate assignment

    // All of these should generate a warning
    f.mkdir();
    f.mkdirs();
    f.delete();
    f.createNewFile();
    f.setLastModified(1L);
    f.setReadOnly();
    f.renameTo(f2);
  }
}