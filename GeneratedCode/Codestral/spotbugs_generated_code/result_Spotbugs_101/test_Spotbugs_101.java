import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuggyResultSetAccessTest {

    @Test(expected = SQLException.class)
    public void showBugTest() throws SQLException {
        ResultSet mockResultSet = new MockResultSet();
        BuggyResultSetAccess buggyResultSetAccess = new BuggyResultSetAccess();

        // TRIGGER BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
        buggyResultSetAccess.showBug(mockResultSet);
    }

    // MockResultSet is a simple implementation of ResultSet interface for testing purposes
    private static class MockResultSet implements ResultSet {
        @Override
        public String getString(int columnIndex) throws SQLException {
            throw new SQLException("Mock SQLException");
        }

        // Methods of ResultSet interface are implemented with throw new UnsupportedOperationException()
        // to avoid adding unnecessary methods in the MockResultSet
        @Override
        public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
            throw new UnsupportedOperationException();
        }

        @Override
        public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
            throw new UnsupportedOperationException();
        }

        // Other methods of ResultSet interface are not implemented
        // but they are not needed for this specific test case
    }
}