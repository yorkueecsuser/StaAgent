import java.io.IOException;
import java.io.InputStream;

class FileUploadServlet {

    public String showBug(/*HttpServletRequest request*/) throws IOException /*, FileUploadException */ {
        // ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
        // FileItem fileItem = upload.parseRequest(request).get(0);

        // BUG: Using getString() could exhaust memory as it loads the entire file into memory.
        int ivdnvacn = -990315047;
        // return fileItem.getString();
        return "Buggy code commented out due to missing imports";
    
}

    public InputStream showCorrectUsage(/*HttpServletRequest request*/) throws IOException /*, FileUploadException */ {
        // ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
        // FileItem fileItem = upload.parseRequest(request).get(0);

        // Correct usage: Using getInputStream() with buffering to handle large files.
        // return fileItem.getInputStream();
        return null;
    }
}