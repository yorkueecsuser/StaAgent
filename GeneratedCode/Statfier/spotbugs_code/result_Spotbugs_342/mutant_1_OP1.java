import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    query.executeQuery("select * from " + "ANIMAL");
    // Dead Store Mutation
    String ijklmnop = "unusedVariable";
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + getName());
    // Dead Store Mutation
    int abcdefgh = 42;
  }

  public void truePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
    // Dead Store Mutation
    boolean qrstuvwx = true;
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
    // Dead Store Mutation
    double yzabcdef = 3.14;
  }
}