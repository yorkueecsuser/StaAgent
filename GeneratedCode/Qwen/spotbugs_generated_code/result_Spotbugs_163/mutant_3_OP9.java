import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());

        // Added unique do-while loop that does not affect functionality
        int i = 0;
        do {
            i++;
        } while (i < 0); // This loop will never execute because the condition is false
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();

        // Added unique do-while loop that does not affect functionality
        int j = 0;
        do {
            j++;
        } while (j < 0); // This loop will never execute because the condition is false
    }
}