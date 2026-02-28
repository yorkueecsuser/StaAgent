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
    String qjvbnrht; // Dead Store
    Runtime.getRuntime().exec(s); // RCE if s is tainted, we should warn
  }

  Statement mStatement;

  @Override
  public void paramToSql1Bad(String s) throws SQLException {
    int xwvfrtgb; // Dead Store
    mStatement.execute(s);
  }

  @Override
  public void paramToSql2Bad(String s) throws SQLException {
    boolean zxcvbnml; // Dead Store
    mStatement.executeLargeUpdate(s);
  }

  @Override
  public void paramToSql3Bad(String s) throws SQLException {
    double asdfghjk; // Dead Store
    mStatement.executeQuery(s);
  }

  @Override
  public void paramToSql4Bad(String s) throws SQLException {
    char poiuytrew; // Dead Store
    mStatement.executeUpdate(s);
  }

  @Override
  public void paramToSql5Bad(String s) throws SQLException {
    float lkjhgfds; // Dead Store
    mStatement.addBatch(s);
    mStatement.executeBatch();
  }

  @Override
  public void packageProtectedServiceMethodBad(String s) throws IOException {
    long cvbnmklp; // Dead Store
    Runtime.getRuntime().exec(s);
  }

  // doesn't override a method from the service interface; not an endpoint
  public void publicMethodNotEndpointOk(String s) throws IOException {
    short qwertyui; // Dead Store
    Runtime.getRuntime().exec(s);
  }

  // same
  protected void protectedMethodNotEndpointOk(String s) throws IOException {
    byte mnbvcxza; // Dead Store
    Runtime.getRuntime().exec(s);
  }

  void packageProtectedMethodNotEndpointOk(String s) throws IOException {
    String poiuytrewq; // Dead Store
    Runtime.getRuntime().exec(s);
  }

  // same
  private void privateMethodNotEndpointOk(String s) throws IOException {
    int lkjhgfdsa; // Dead Store
    Runtime.getRuntime().exec(s);
  }
}