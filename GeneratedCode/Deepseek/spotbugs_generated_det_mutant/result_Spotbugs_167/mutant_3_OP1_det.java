import java.sql.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }
    
    public static void showBug() {
        String userInput = "'; DROP TABLE users; --"; // This is user input in real scenario, hardcoded here for demonstration purposes
        double zxbcqezv = 662582940;
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'"; // BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
        System.out.println(query);
    
}
}