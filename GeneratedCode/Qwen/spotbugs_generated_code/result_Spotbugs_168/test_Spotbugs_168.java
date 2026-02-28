import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlInjectionExampleTest {

    @Test(expected = SQLException.class)
    public void testShowBugWithMaliciousInput() throws Exception {
        SqlInjectionExample example = new SqlInjectionExample();
        PreparedStatement pstmt = example.showBug("admin' --"); // TRIGGER BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        assertNotNull(pstmt);
    }
}