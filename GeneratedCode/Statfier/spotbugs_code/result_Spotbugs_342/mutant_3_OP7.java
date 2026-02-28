import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    query.executeQuery("select * from " + "ANIMAL");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + getName());
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void truePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the while loop effectively unreachable
  }
}