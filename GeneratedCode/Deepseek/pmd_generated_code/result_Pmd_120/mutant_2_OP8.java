import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileStuff {
   private String bad1(InputStream fileItem) throws IOException {
        byte[] buffer1 = new byte[fileItem.available()];
        fileItem.read(buffer1);
        return new String(buffer1); // BUG: UseIOStreamsWithApacheCommonsFileItem
   }

   private InputStream good2(InputStream fileItem) throws IOException {
        byte[] buffer2 = new byte[fileItem.available()];
        fileItem.read(buffer2);
        return new ByteArrayInputStream(buffer2);
   }

   public String showBug(InputStream fileItem) throws IOException {
        return bad1(fileItem); // This will return a string representation of the entire file content, which can cause OutOfMemoryError
   }

   public InputStream showBugGood(InputStream fileItem) throws IOException {
        return good2(fileItem); // This will return an InputStream of the file content, which is more memory efficient
   }
}