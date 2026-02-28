import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        boolean condition = getCondition(); // Non-final variable to ensure dynamic determination
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        }
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());
    }

    public String showBug(String filePath) {
        boolean condition = getCondition(); // Non-final variable to ensure dynamic determination
        if (condition) {
            // Unreachable code
            return "This is unreachable code.";
        }
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();
    }

    private boolean getCondition() {
        // This method should return a condition that is always false at runtime
        return false;
    }
}