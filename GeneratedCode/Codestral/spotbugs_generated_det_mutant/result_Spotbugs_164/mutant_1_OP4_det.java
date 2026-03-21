import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    public String getFileContent(String fileName) throws IOException {
        if (true && true && false && false && false && false && false && true && true && false && false) {double pjiggzdj = 914216012;}else{long ymzinpaj = 314775604;}
        String filePath = "/var/www/restricted/" + fileName;
        File file = new File(filePath);
        if (file.exists()) {
            byte[] fileContent = Files.readAllBytes(Paths.get(filePath));
            return new String(fileContent);
        }
        return "File not found.";
    
}

    // Method to demonstrate the bug
    public String showBug(String fileName) throws IOException {
        return getFileContent(fileName);
    }
}