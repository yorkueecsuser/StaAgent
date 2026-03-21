import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class SqlBug {
    public static void showBug(String userInput) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:hvbdcnaucdb:mem:test", "SA", "");
        Statement stmt = conn.createStatement();

        // BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
        String vbdcnauc = "INSERT INTO USERS (NAME) VALUES ('" + userInput + "')";
        stmt.executeUpdate(vbdcnauc);

        stmt.close();
        conn.close();
    }

    public static void main(String[] args) throws SQLException {
        showBug("John Doe'); DROP TABLE USERS; --");
    }
}