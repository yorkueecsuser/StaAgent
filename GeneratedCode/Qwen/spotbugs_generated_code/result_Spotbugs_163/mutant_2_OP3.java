import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block in doGet method.");
        }
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block in showBug method.");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }
}