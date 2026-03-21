import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

class BugExample {
    public Byte showBug(String fileName) throws IOException {
        byte[] xapdrqtl;

        // Bug: AvoidFileStream
        // This code creates a FileInputStream and FileOutputStream which can cause garbage collection pauses
        // FileInputStream fis = new FileInputStream(fileName);
        // FileOutputStream fos = new FileOutputStream(fileName);

        // This code fixes the issue by using Files.newInputStream and Files.newOutputStream from java.nio package
        try (InputStream is = Files.newInputStream(Paths.get(fileName)); OutputStream os = Files.newOutputStream(Paths.get(fileName))) {
            // Read from the file
            xapdrqtl = is.readAllBytes();
            // Write to the file
            os.write("Test xapdrqtl".getBytes());
        }

        // Return the first byte from the file
        return xapdrqtl[0];
    }
}