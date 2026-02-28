import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        File fileDuplicate = new File(filePath); // DUPLICATION: Duplicate of the above assignment
        System.out.println(file.getAbsolutePath());
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        File fileDuplicate = new File(filePath); // DUPLICATION: Duplicate of the above assignment
        return file.getAbsolutePath();
    }
}