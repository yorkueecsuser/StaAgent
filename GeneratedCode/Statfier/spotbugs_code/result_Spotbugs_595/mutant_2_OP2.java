import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Bug1779315 {
  private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  private static final DateFormat dateFormatCopy = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"); // Duplicate of dateFormat

  private static final DateFormat alternativeDateFormat =
      new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
  private static final DateFormat alternativeDateFormatCopy =
      new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss"); // Duplicate of alternativeDateFormat

  public void testFilesMethods() throws IOException {
    File f = new File("blah.txt");
    File fCopy = new File("blah.txt"); // Duplicate of f
    File f2 = new File("blah2.txt");
    File f2Copy = new File("blah2.txt"); // Duplicate of f2

    // All of these should generate a warning
    f.mkdir();
    f.mkdirs();
    f.delete();
    f.createNewFile();
    f.setLastModified(1L);
    f.setReadOnly();
    f.renameTo(f2);

    fCopy.mkdir(); // Duplicate of f.mkdir()
    fCopy.mkdirs(); // Duplicate of f.mkdirs()
    fCopy.delete(); // Duplicate of f.delete()
    fCopy.createNewFile(); // Duplicate of f.createNewFile()
    fCopy.setLastModified(1L); // Duplicate of f.setLastModified(1L)
    fCopy.setReadOnly(); // Duplicate of f.setReadOnly()
    fCopy.renameTo(f2Copy); // Duplicate of f.renameTo(f2)
  }
}