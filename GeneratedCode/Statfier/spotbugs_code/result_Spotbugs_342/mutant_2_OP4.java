import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    query.executeQuery("select * from " + "ANIMAL");
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    query.executeQuery("select * from " + getName());
  }

  public void truePositive(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
  }

  private boolean getCondition() {
    return true; // This method can return any dynamic condition
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}