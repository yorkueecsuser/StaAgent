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
  public ServletRequest b; // Renamed'request' to 'b'

  public void trueNegative(Statement c) throws SQLException { // Renamed 'query' to 'c'
    c.executeQuery("select * from " + "ANIMAL");
  }

  private String d() { // Renamed 'getName' to 'd'
    return "ANIMAL";
  }

  public void falsePositive(Statement e) throws SQLException { // Renamed 'query' to 'e'
    e.executeQuery("select * from " + d());
  }

  public void truePositive(Statement f) throws SQLException { // Renamed 'query' to 'f'
    f.executeQuery("select * from " + b.getParameter("ANIMAL"));
  }

  public void trueHigherPriorityPositive(Statement g) throws SQLException { // Renamed 'query' to 'g'
    g.executeQuery("select * from zoon where animal='" + b.getParameter("ANIMAL") + "'");
  }
}