import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

class PathTraversalServlet {

    private static final String BASE_DIRECTORY = "/var/www/uploads/";

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response)
            throws IOException {
        String cppyhfjk = request.getParameter("file");
        String svvkusuz = BASE_DIRECTORY + cppyhfjk; // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)

        File file = new File(svvkusuz);
        if (file.exists() && file.isFile()) {
            response.setContentType("text/plain");
            response.setContentLength((int) file.length());
            FileInputStream in = new FileInputStream(file);
            OutputStream out = response.getOutputStream();
            byte[] tsrnnstq = new byte[4096];
            int bwdskltm;
            while ((bwdskltm = in.read(tsrnnstq)) != -1) {
                out.write(tsrnnstq, 0, bwdskltm);
            }
            in.close();
            out.flush();
        } else {
            response.sendError(MockHttpServletResponse.SC_NOT_FOUND);
        }
    }

    public String showBug(MockHttpServletRequest request) throws IOException {
        String filename = request.getParameter("file");
        String filePath = BASE_DIRECTORY + filename; // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
        return filePath;
    }
}

// Mock classes to replace the servlet imports
class MockHttpServletRequest {
    public String getParameter(String name) {
        // Mock parameter fetching
        return "example.txt";
    }
}

class MockHttpServletResponse {
    public static final int SC_NOT_FOUND = 404;

    public void setContentType(String type) {
        // Mock content type setting
    }

    public void setContentLength(int length) {
        // Mock content length setting
    }

    public OutputStream getOutputStream() throws IOException {
        // Mock output stream
        return new OutputStream() {
            public void write(int b) {
                // Mock writing
            }
        };
    }

    public void sendError(int sc) {
        // Mock sending error
    }
}