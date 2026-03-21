import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemHeaders;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

class FileUploadBug {
    // BUG: UseIOStreamsWithApacheCommonsFileItem
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (!ServletFileUpload.isMultipartContent(request)) {
            throw new FileUploadException("Not a multipart request");
        }

        ServletFileUpload upload = new ServletFileUpload();
        FileItemIterator iterator = upload.getItemIterator(request);
        while (iterator.hasNext()) {
            FileItem item = iterator.next();
            InputStream inputStream = item.getInputStream();
            OutputStream outputStream = response.getOutputStream();
            IOUtils.copy(inputStream, outputStream);
            inputStream.close();
            outputStream.close();
        }
    }
public String showBug() throws Exception {
    HttpServletRequest request =(HttpServletRequest)mock(HttpServletRequest.class);
    HttpServletResponse response =(HttpServletResponse)mock(HttpServletResponse.class);
    File file = new File("sample.txt");
    file = new File("sample.txt");
    FileItem item = new DiskFileItem("file" , file);
    item.setHeaders(new FileItemHeaders("multipart/form-data" , "form-data" , "text/plain" , "sample.txt"));
    item.setInputStream(new FileInputStream(file));
    doPost(request , response);
    return response.getOutputStream().toString();
}
}