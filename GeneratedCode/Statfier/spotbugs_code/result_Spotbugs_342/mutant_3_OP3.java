import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in trueNegative");
    }
    query.executeQuery("select * from " + "ANIMAL");
  }

  private String getName() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in getName");
    }
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in falsePositive");
    }
    query.executeQuery("select * from " + getName());
  }

  public void truePositive(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in truePositive");
    }
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in trueHigherPriorityPositive");
    }
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the if blocks are unreachable
  }
}