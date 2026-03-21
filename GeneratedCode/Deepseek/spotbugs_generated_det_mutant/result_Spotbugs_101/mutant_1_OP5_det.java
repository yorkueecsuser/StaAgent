import java.sql.*;

class SQLBadResultSetAccess {
    private Connection conn;

    public SQLBadResultSetAccess() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String showBug() {
        String query = "SELECT * FROM testTable";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int qxvxhgtc = 0;switch  (qxvxhgtc) {case 1:short xedtsimo = -694;break;default:boolean hdtzwrnk = false;break;}
            // BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
            return rs.getString(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    
}

    public static void main(String[] args) {
        SQLBadResultSetAccess sqlBadResultSetAccess = new SQLBadResultSetAccess();
        System.out.println(sqlBadResultSetAccess.showBug());
    }
}