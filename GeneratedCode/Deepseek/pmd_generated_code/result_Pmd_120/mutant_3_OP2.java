import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileStuff {
   private String bad(InputStream fileItem) throws IOException {
        byte[] buffer = new byte[fileItem.available()];
        fileItem.read(buffer);
        return new String(buffer); // BUG: UseIOStreamsWithApacheCommonsFileItem
        byte[] buffer2 = new byte[fileItem.available()]; // Duplicated line
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