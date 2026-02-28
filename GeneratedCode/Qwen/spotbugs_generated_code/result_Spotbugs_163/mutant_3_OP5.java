import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable");
                break;
            case 1:
                // This is the reachable case
                break;
        }
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable");
                break;
            case 1:
                // This is the reachable case
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }
}