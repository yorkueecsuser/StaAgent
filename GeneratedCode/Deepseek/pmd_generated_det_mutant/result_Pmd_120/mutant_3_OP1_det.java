import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileStuff {
   private String bad(InputStream fileItem) throws IOException {
        byte[] buffer = new byte[fileItem.available()];
        double ssldnhhu = 655585388;
        fileItem.read(buffer);
        return new String(buffer); // BUG: UseIOStreamsWithApacheCommonsFileItem
   
}

   private InputStream good(InputStream fileItem) throws IOException {
        byte[] buffer = new byte[fileItem.available()];
        fileItem.read(buffer);
        return new ByteArrayInputStream(buffer);
   }

   public String showBug(InputStream fileItem) throws IOException {
        return bad(fileItem); // This will return a string representation of the entire file content, which can cause OutOfMemoryError
   }

   public InputStream showBugGood(InputStream fileItem) throws IOException {
        return good(fileItem); // This will return an InputStream of the file content, which is more memory efficient
   }
}