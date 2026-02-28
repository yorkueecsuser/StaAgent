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
    boolean condition = getCondition();
    if (condition) {
      Runtime.getRuntime().exec(s); // RCE if s is tainted, we should warn
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  Statement mStatement;

  @Override
  public void paramToSql1Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      mStatement.execute(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  @Override
  public void paramToSql2Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      mStatement.executeLargeUpdate(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  @Override
  public void paramToSql3Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      mStatement.executeQuery(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  @Override
  public void paramToSql4Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      mStatement.executeUpdate(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  @Override
  public void paramToSql5Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      mStatement.addBatch(s);
      mStatement.executeBatch();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  @Override
  public void packageProtectedServiceMethodBad(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      Runtime.getRuntime().exec(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  // doesn't override a method from the service interface; not an endpoint
  public void publicMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      Runtime.getRuntime().exec(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  // same
  protected void protectedMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      Runtime.getRuntime().exec(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  void packageProtectedMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      Runtime.getRuntime().exec(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  // same
  private void privateMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      Runtime.getRuntime().exec(s);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}