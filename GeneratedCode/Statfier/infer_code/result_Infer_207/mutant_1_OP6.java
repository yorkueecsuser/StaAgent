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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  Statement mStatement;

  @Override
  public void paramToSql1Bad(String s) throws SQLException {
    mStatement.execute(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void paramToSql2Bad(String s) throws SQLException {
    mStatement.executeLargeUpdate(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void paramToSql3Bad(String s) throws SQLException {
    mStatement.executeQuery(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void paramToSql4Bad(String s) throws SQLException {
    mStatement.executeUpdate(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void paramToSql5Bad(String s) throws SQLException {
    mStatement.addBatch(s);
    mStatement.executeBatch();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void packageProtectedServiceMethodBad(String s) throws IOException {
    Runtime.getRuntime().exec(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  // doesn't override a method from the service interface; not an endpoint
  public void publicMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  // same
  protected void protectedMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  void packageProtectedMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  // same
  private void privateMethodNotEndpointOk(String s) throws IOException {
    Runtime.getRuntime().exec(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}