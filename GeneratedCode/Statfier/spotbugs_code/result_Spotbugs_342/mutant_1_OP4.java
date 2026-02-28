import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    query.executeQuery("select * from " + "ANIMAL");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + getName());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  public void truePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}