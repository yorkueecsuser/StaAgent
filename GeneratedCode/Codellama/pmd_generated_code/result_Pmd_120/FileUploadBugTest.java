import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemHeaders;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileUploadBugTest {
    @Test
    public void testShowBug() throws Exception {
        // Set up a mock request and response
        HttpServletRequest request = (HttpServletRequest)mock(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse)mock(HttpServletResponse.class);

        // Set up a file upload item
        File file = new File("sample.txt");
        FileItem item = new DiskFileItem("file", file);
        item.setHeaders(new FileItemHeaders("multipart/form-data", "form-data", "text/plain", "sample.txt"));
        item.setInputStream(new FileInputStream(file));

        // Call the doPost method with the mock objects
        FileUploadBug.doPost(request, response);

        // Return the response output
        String output = response.getOutputStream().toString();

        // TRIGGER BUG: UseIOStreamsWithApacheCommonsFileItem
        assertEquals("sample.txt", output);
    }
}