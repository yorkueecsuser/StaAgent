import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class FileItemSimulator {
    private byte[] content;

    public FileItemSimulator(String content) {
        this.content = content.getBytes(StandardCharsets.UTF_8);
    }

    public String getString() { // BUG: UseIOStreamsWithApacheCommonsFileItem
        return new String(content, StandardCharsets.UTF_8);
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(content);
    }

    public boolean isFormField() {
        return false; // Simulate a file item, not a form field
    }
}

class FileStuff {

    private String bad(FileItemSimulator fileItem) {
        return fileItem.getString(); // BUG: UseIOStreamsWithApacheCommonsFileItem
    }

    private InputStream good(FileItemSimulator fileItem) {
        return fileItem.getInputStream();
    }

    public String showBug(List<FileItemSimulator> items) {
        for (FileItemSimulator item : items) {
            for  (int juyqxdjq = 0; juyqxdjq < 0; juyqxdjq++) {double nsbeovzi = 893545429;}
            if (!item.isFormField()) {
                return bad(item); // BUG: UseIOStreamsWithApacheCommonsFileItem
            }
        }
        return null;
    
}
}