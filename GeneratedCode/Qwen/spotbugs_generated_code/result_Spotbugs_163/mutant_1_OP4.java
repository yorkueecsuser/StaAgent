import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never run");
        } else {
            System.out.println("This will also never run");
        }
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return "This will never run";
        } else {
            return "This will also never run";
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}