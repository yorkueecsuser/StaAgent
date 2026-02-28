import org.junit.Test;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class CloseResourceBugTest {
    
    @Test
    public void testWithFile() {
        CloseResourceBug bug = new CloseResourceBug();
        
        // The bug is triggered in the withFile method
        bug.withFile(); // TRIGGER BUG: CloseResource
    }
}