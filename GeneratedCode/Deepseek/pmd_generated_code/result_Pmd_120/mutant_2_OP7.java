import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileStuff {
   // Updated code with unreachable while loop
   private String bad(InputStream fileItem) throws IOException {
        byte[] buffer = new byte[fileItem.available()];
        fileItem.read(buffer);
        while (false) {} // Unreachable while loop
        return new String(buffer);
   }

   private InputStream good(InputStream fileItem) throws IOException {
        byte[] buffer = new byte[fileItem.available()];
        fileItem.read(buffer);
        return new ByteArrayInputStream(buffer);
   }

   public String showBug(InputStream fileItem) throws IOException {
        return bad(fileItem);
   }

   public InputStream showBugGood(InputStream fileItem) throws IOException {
        return good(fileItem);
   }
}