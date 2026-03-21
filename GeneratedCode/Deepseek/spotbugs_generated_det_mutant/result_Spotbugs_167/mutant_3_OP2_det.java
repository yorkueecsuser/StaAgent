import java.sql.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String userInput = "'; DROP TABLE users; --";
    userInput = "'; DROP TABLE users; --";
    String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
    System.out.println(query);
}
}