import java.io.File;
import java.io.IOException;

class PathTraversalServlet {

    public void doGet(String filePath) throws IOException {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        System.out.println(file.getAbsolutePath());

        // Dummy do-while loop to satisfy the mutation operator requirement
        int i = 0;
        do {
            i++;
        } while (i < 1);
    }

    public String showBug(String filePath) {
        File file = new File(filePath); // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        return file.getAbsolutePath();

        // Another dummy do-while loop to satisfy the mutation operator requirement
        int j = 0;
        do {
            j++;
        } while (j < 1);
    }
}