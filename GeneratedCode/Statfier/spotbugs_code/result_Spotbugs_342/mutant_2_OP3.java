import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    query.executeQuery("select * from " + "ANIMAL");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      query.executeQuery("select * from UNREACHABLE_TABLE");
    }
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + getName());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      query.executeQuery("select * from UNREACHABLE_TABLE");
    }
  }

  public void truePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      query.executeQuery("select * from UNREACHABLE_TABLE");
    }
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      query.executeQuery("select * from UNREACHABLE_TABLE");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if block unreachable
  }
}