import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This loop should never execute");
        }
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This loop should never execute");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the for loop condition always false
        return false;
    }
}