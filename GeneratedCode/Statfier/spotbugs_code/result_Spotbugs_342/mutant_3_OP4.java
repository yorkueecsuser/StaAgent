import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    query.executeQuery("select * from " + "ANIMAL");
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      query.executeQuery("select * from UNREACHABLE_TABLE");
    } else {
      // This block will always execute
      query.executeQuery("select * from ANIMAL");
    }
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + getName());
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      query.executeQuery("select * from UNREACHABLE_TABLE");
    } else {
      // This block will always execute
      query.executeQuery("select * from " + getName());
    }
  }

  public void truePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      query.executeQuery("select * from UNREACHABLE_TABLE");
    } else {
      // This block will always execute
      query.executeQuery("select * from " + request.getParameter("ANIMAL"));
    }
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      query.executeQuery("select * from UNREACHABLE_TABLE");
    } else {
      // This block will always execute
      query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}