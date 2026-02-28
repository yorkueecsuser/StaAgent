import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileStuff {
   private String bad(InputStream fileItem) throws IOException {
        byte[] buffer = new byte[fileItem.available()];
        fileItem.read(buffer);
        if (false) {
            System.out.println("This is an unreachable code");
        }
        return new String(buffer); // BUG: UseIOStreamsWithApacheCommonsFileItem
   }

   private InputStream good(InputStream fileItem) throws IOException {
        boolean condition = getCondition();
        byte[] buffer = new byte[fileItem.available()];
        fileItem.read(buffer);
        if (condition) {
            System.out.println("This code is reachable");
        }
        return new ByteArrayInputStream(buffer);
   }

   public String showBug(InputStream fileItem) throws IOException {
        return bad(fileItem); // This will return a string representation of the entire file content, which can cause OutOfMemoryError
   }

   public InputStream showBugGood(InputStream fileItem) throws IOException {
        return good(fileItem); // This will return an InputStream of the file content, which is more memory efficient
   }

   private boolean getCondition() {
        return false;
   }
}