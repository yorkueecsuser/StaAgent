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
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in serviceMethodBad");
    }
    Runtime.getRuntime().exec(s); // RCE if s is tainted, we should warn
  }

  Statement mStatement;

  @Override
  public void paramToSql1Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in paramToSql1Bad");
    }
    mStatement.execute(s);
  }

  @Override
  public void paramToSql2Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in paramToSql2Bad");
    }
    mStatement.executeLargeUpdate(s);
  }

  @Override
  public void paramToSql3Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in paramToSql3Bad");
    }
    mStatement.executeQuery(s);
  }

  @Override
  public void paramToSql4Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in paramToSql4Bad");
    }
    mStatement.executeUpdate(s);
  }

  @Override
  public void paramToSql5Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in paramToSql5Bad");
    }
    mStatement.addBatch(s);
    mStatement.executeBatch();
  }

  @Override
  public void packageProtectedServiceMethodBad(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in packageProtectedServiceMethodBad");
    }
    Runtime.getRuntime().exec(s);
  }

  // doesn't override a method from the service interface; not an endpoint
  public void publicMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in publicMethodNotEndpointOk");
    }
    Runtime.getRuntime().exec(s);
  }

  // same
  protected void protectedMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in protectedMethodNotEndpointOk");
    }
    Runtime.getRuntime().exec(s);
  }

  void packageProtectedMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in packageProtectedMethodNotEndpointOk");
    }
    Runtime.getRuntime().exec(s);
  }

  // same
  private void privateMethodNotEndpointOk(String s) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is an unreachable else block in privateMethodNotEndpointOk");
    }
    Runtime.getRuntime().exec(s);
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else blocks unreachable
  }
}