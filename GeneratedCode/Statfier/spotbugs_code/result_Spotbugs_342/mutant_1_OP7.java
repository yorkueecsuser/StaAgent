import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    query.executeQuery("select * from " + "ANIMAL");
  }

  private String getName() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    query.executeQuery("select * from " + getName());
  }

  public void truePositive(Statement query) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loops unreachable
  }
}