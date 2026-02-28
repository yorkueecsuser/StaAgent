import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileStuff {
   private String bad(InputStream fileItem) throws IOException {
        byte[] buffer = new byte[fileItem.available()];
        fileItem.read(buffer);
        int value = 0; 
        switch (value) {
            case 0:
                break;
        }
        return new String(buffer); // Added switch statement to make this unreachable
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