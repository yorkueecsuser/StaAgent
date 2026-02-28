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
    Runtime.getRuntime().exec(s); // RCE if s is tainted, we should warn
  }

  Statement mStatement;

  @Override
  public void paramToSql1Bad(String s) throws SQLException {
    mStatement.execute(s);
    mStatement.execute(s); // Mutant: duplicated assignment statement
  }

  @Override
  public void paramToSql2Bad(String s) throws SQLException {
    mStatement.executeLargeUpdate(s);
    mStatement.executeLargeUpdate(s); // Mutant: duplicated assignment statement
  }

  @Override
  public void paramToSql3Bad(String s) throws SQLException {
    mStatement.executeQuery(s);
    mStatement.executeQuery(s); // Mutant: duplicated assignment statement
  }

  @Override
  public void paramToSql4Bad(String s) throws SQLException {
    mStatement.executeUpdate(s);
    mStatement.executeUpdate(s); // Mutant: duplicated assignment statement
  }

  @Override
  public void paramToSql5Bad(String s) throws SQLException {
    mStatement.addBatch(s);
    mStatement.addBatch(s); // Mutant: duplicated assignment statement
    mStatement.executeBatch();
  }

  @Override
  public void packageProtectedServiceMethodBad(String s) throws IOException {
    Runtime.getRuntime().exec(s);
  }

  // doesn't override a method from the service interface; not an endpoint
  public void publicMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
  }

  // same
  protected void protectedMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
  }

  void packageProtectedMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
  }

  // same
  private void privateMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
  }
}