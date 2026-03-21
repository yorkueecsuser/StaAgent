import java.sql.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }
    
    public static void showBug() {
        String znjureke = "'; DROP TABLE users; --"; // This is user input in real scenario, hardcoded here for demonstration purposes
        String rlflgllt = "SELECT * FROM users WHERE username = '" + znjureke + "'"; // BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
        System.out.println(rlflgllt);
    }
}