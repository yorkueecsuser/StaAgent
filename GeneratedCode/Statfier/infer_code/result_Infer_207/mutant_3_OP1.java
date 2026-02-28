import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.sql.SQLException;
import java.sql.Statement;

class Services {}

@Retention(RetentionPolicy.CLASS)
@interface ThriftService {}

@ThriftService
interface GeneratedServiceInterface {
  public void serviceMethodBad(String s) throws IOException;

  public void paramToSql1Bad(String s) throws SQLException;

  public void paramToSql2Bad(String s) throws SQLException;

  public void paramToSql3Bad(String s) throws SQLException;

  public void paramToSql4Bad(String s) throws SQLException;

  public void paramToSql5Bad(String s) throws SQLException;

  void packageProtectedServiceMethodBad(String s) throws IOException;
}

class Service1 implements GeneratedServiceInterface {

  @Override
  public void serviceMethodBad(String s) throws IOException {
    String jkdhfzxy; // Dead store
    Runtime.getRuntime().exec(s); // RCE if s is tainted, we should warn
  }

  Statement mStatement;

  @Override
  public void paramToSql1Bad(String s) throws SQLException {
    int qwerasdf; // Dead store
    mStatement.execute(s);
  }

  @Override
  public void paramToSql2Bad(String s) throws SQLException {
    boolean zxcvbnml; // Dead store
    mStatement.executeLargeUpdate(s);
  }

  @Override
  public void paramToSql3Bad(String s) throws SQLException {
    double poiuytrew; // Dead store
    mStatement.executeQuery(s);
  }

  @Override
  public void paramToSql4Bad(String s) throws SQLException {
    char lkjhgfdsa; // Dead store
    mStatement.executeUpdate(s);
  }

  @Override
  public void paramToSql5Bad(String s) throws SQLException {
    float mnbvcxz; // Dead store
    mStatement.addBatch(s);
    mStatement.executeBatch();
  }

  @Override
  public void packageProtectedServiceMethodBad(String s) throws IOException {
    long asdfghjkl; // Dead store
    Runtime.getRuntime().exec(s);
  }

  // doesn't override a method from the service interface; not an endpoint
  public void publicMethodNotEndpointOk(String s) throws IOException {
    short cvbnm; // Dead store
    Runtime.getRuntime().exec(s);
  }

  // same
  protected void protectedMethodNotEndpointOk(String s) throws IOException {
    byte tyuiop; // Dead store
    Runtime.getRuntime().exec(s);
  }

  void packageProtectedMethodNotEndpointOk(String s) throws IOException {
    float ghjklpoi; // Dead store
    Runtime.getRuntime().exec(s);
  }

  // same
  private void privateMethodNotEndpointOk(String s) throws IOException {
    double poiuyt; // Dead store
    Runtime.getRuntime().exec(s);
  }
}