import org.junit.Test;
import static org.junit.Assert.*;

public class SqlInjectionDemoTest {

    @Test
    public void testShowBugInjection() {
        SqlInjectionDemo demo = new SqlInjectionDemo();
        String userInput = "admin' OR '1'='1"; // TRIGGER BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        demo.showBug(userInput); // TRIGGER BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
    }
}