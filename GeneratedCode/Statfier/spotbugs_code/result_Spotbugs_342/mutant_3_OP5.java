import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    query.executeQuery("select * from " + "ANIMAL");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable code.");
        break;
    }
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + getName());
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable code.");
        break;
    }
  }

  public void truePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable code.");
        break;
    }
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable code.");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch statement unreachable
  }
}