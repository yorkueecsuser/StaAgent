import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class SQLInjectionTest {
    @Test
    public void testShowBug() throws SQLException {
        SQLInjection sqlInjection = new SQLInjection();

        // TRIGGER BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        String userInput = "' OR '1'='1";
        String result = sqlInjection.showBug(userInput);

        // This assertion will fail, because the method should return the username from the database, which it doesn't, because the SQL injection has happened.
        assertEquals("admin", result); 
    }
}