import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());

        // Mutated code with unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            // This is the unreachable if-else branch
            System.out.println("This is unreachable code due to the condition always being false.");
        }
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();

        // Mutated code with unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return "Reachable return value.";
        } else {
            // This is the unreachable if-else branch
            return "Unreachable return value due to the condition always being false.";
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the else branch unreachable
        return false;
    }
}