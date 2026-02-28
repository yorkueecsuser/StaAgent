import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Bug3506138 {

  public static Connection getConnection() {
    throw new UnsupportedOperationException();
  }

  @ExpectWarning("ODR_OPEN_DATABASE_RESOURCE")
  public static void test0(String url) throws Exception {
    Connection conn;
    PreparedStatement pstm = null;
    try {
      conn = DriverManager.getConnection(url);
      pstm = conn.prepareStatement("123");
      pstm.executeUpdate();
      
      // Mutant code: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run");
      } else {
        System.out.println("This will also never run");
      }
    } finally {
      if (pstm!= null) pstm.close();
    }
  }

  @DesireWarning("ODR_OPEN_DATABASE_RESOURCE")
  public static void test1() throws Exception {
    Connection conn;
    PreparedStatement pstm = null;
    try {
      conn = getConnection();
      pstm = conn.prepareStatement("123");
      pstm.executeUpdate();
      
      // Mutant code: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run either");
      } else {
        System.out.println("This will also never run either");
      }
    } finally {
      if (pstm!= null) pstm.close();
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the branches unreachable
  }
}