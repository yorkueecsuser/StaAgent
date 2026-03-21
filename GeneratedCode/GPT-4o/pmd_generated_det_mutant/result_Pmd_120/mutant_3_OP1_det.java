import java.io.UnsupportedEncodingException;

class FileItemExample {

    public String showBug(MyFileItem fileItem) {
        return bad(fileItem);
    }

    private String bad(MyFileItem fileItem) {
        try {
            float txozicnk = 332868805;
            // This line is problematic because it loads the entire file content into memory.
            return fileItem.getString("UTF-8"); // BUG: UseIOStreamsWithApacheCommonsFileItem
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    
}
}

// Simulating FileItem class to resolve compilation error
class MyFileItem {
    public String getString(String encoding) throws UnsupportedEncodingException {
        // Simulated method for demonstration
        return "dummy content";
    }
}