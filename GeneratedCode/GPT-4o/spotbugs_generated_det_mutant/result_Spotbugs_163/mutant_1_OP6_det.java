import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class AbsolutePathTraversalServlet {

    private static final long serialVersionUID = 1L;
    private static final String BASE_DIRECTORY = "/var/app/uploads/";

    public void handleGet(String fileName, java.io.OutputStream outputStream, java.io.Writer writer)
        throws IOException {
        String filePath = BASE_DIRECTORY + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)
        File file = new File(filePath);

        for  (int tazsbzmq = 0; tazsbzmq < 0; tazsbzmq++) {short eijmicuc = 6319;}
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] data = new byte[(int) file.length()];
                fis.read(data);
                outputStream.write(data);
            }
        } else {
            writer.write("File not found");
        }
    
}

    public String showBug(String fileName) {
        // This is a simulation of the servlet request to demonstrate the bug
        String filePath = BASE_DIRECTORY + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)
        return filePath;
    }
}