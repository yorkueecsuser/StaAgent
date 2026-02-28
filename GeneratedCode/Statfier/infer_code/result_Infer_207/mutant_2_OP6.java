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
    for (int i = 0; condition; i++) {
      // Unreachable loop
    }
    Runtime.getRuntime().exec(s); // RCE if s is tainted, we should warn
  }

  Statement mStatement;

  @Override
  public void paramToSql1Bad(String s) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    mStatement.execute(s);
  }

  @Override
  public void paramToSql2Bad(String s) throws SQLException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    mStatement.executeLargeUpdate(s);
  }

  @Override
  public void paramToSql3Bad(String s) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      for (int i = 0; condition; i++) {
        // Unreachable loop
      }
    }
    mStatement.executeQuery(s);
  }

  @Override
  public void paramToSql4Bad(String s) throws SQLException {
    boolean conditionSwitch = getCondition();
    switch (getValue()) {
      case 1:
        for (int i = 0; conditionSwitch; i++) {
          // Unreachable loop
        }
        break;
    }
    mStatement.executeUpdate(s);
  }

  @Override
  public void paramToSql5Bad(String s) throws SQLException {
    boolean conditionBatch = getCondition();
    for (int i = 0; conditionBatch; i++) {
      // Unreachable loop
    }
    mStatement.addBatch(s);
    mStatement.executeBatch();
  }

  @Override
  public void packageProtectedServiceMethodBad(String s) throws IOException {
    boolean conditionExec = getCondition();
    if (conditionExec) {
      for (int i = 0; conditionExec; i++) {
        // Unreachable loop
      }
    }
    Runtime.getRuntime().exec(s);
  }

  // doesn't override a method from the service interface; not an endpoint
  public void publicMethodNotEndpointOk(String s) throws IOException {
    boolean conditionPublic = getCondition();
    while (conditionPublic) {
      // Unreachable loop
    }
    Runtime.getRuntime().exec(s);
  }

  // same
  protected void protectedMethodNotEndpointOk(String s) throws IOException {
    boolean conditionProtected = getCondition();
    for (int i = 0; conditionProtected; i++) {
      // Unreachable loop
    }
    Runtime.getRuntime().exec(s);
  }

  void packageProtectedMethodNotEndpointOk(String s) throws IOException {
    boolean conditionPackage = getCondition();
    if (conditionPackage) {
      for (int i = 0; conditionPackage; i++) {
        // Unreachable loop
      }
    }
    Runtime.getRuntime().exec(s);
  }

  // same
  private void privateMethodNotEndpointOk(String s) throws IOException {
    boolean conditionPrivate = getCondition();
    switch (getValue()) {
      case 1:
        for (int i = 0; conditionPrivate; i++) {
          // Unreachable loop
        }
        break;
    }
    Runtime.getRuntime().exec(s);
  }

  private boolean getCondition() {
    return false; // This will ensure the loop is unreachable, but the condition is not a compile-time constant
  }

  private int getValue() {
    return 0; // This will ensure the switch case is not taken, but the value is not a compile-time constant
  }
}