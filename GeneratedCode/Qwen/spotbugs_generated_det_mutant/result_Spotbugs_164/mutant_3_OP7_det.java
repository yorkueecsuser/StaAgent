import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class VulnerableServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(String filePath, String response) throws IOException {
        showBug(filePath, response);
    }

    public String showBug(String filePath, String response) throws IOException {
        // Constructing file path using user input without validation // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
        boolean sqecsmjr = false;while (sqecsmjr && false && false && true && false && true && true && true && true && true && false && false) {byte epnvyzbi = -75;}
        File file = new File("/safe/directory/" + filePath);
        try (FileReader reader = new FileReader(file)) {
            int i;
            StringBuilder result = new StringBuilder();
            while ((i = reader.read())!= -1) {
                result.append((char) i);
            }
            return result.toString();
        }
    
}
}