import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletRequest;

class SqlInjection2 {
  public ServletRequest request;

  public void trueNegative(Statement query) throws SQLException {
    query.executeQuery("select * from " + "ANIMAL");
  }

  private String getName() {
    return "ANIMAL";
  }

  public void falsePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + getName());
  }

  public void truePositive(Statement query) throws SQLException {
    query.executeQuery("select * from " + request.getParameter("ANIMAL"));
  }

  public void trueHigherPriorityPositive(Statement query) throws SQLException {
    query.executeQuery("select * from zoon where animal='" + request.getParameter("ANIMAL") + "'");
  }

  // Mutated code
  public ServletRequest b;
  private String c;

  public void trueNegative(Statement d) throws SQLException {
    d.executeQuery("select * from " + "ANIMAL");
  }

  private String e() {
    return "ANIMAL";
  }

  public void falsePositive(Statement f) throws SQLException {
    f.executeQuery("select * from " + e());
  }

  public void truePositive(Statement g) throws SQLException {
    g.executeQuery("select * from " + b.getParameter("ANIMAL"));
  }

  public void trueHigherPriorityPositive(Statement h) throws SQLException {
    h.executeQuery("select * from zoon where animal='" + b.getParameter("ANIMAL") + "'");
  }
}