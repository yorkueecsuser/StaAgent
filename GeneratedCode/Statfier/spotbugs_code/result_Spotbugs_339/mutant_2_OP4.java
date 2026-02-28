import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Contributed by Matt Hargett, http://www.clock.org/~matt

class NoSqlInjection {
  private static final String[] COLUMNS = new String[] {"ID", "NAME"};

  private static final String[] PREFIXES = new String[] {"GOPHER", "LLAMA"};

  private Connection connection;

  public NoSqlInjection(Connection connection) {
    this.connection = connection;
  }

  public void beSafe() throws SQLException {
    Statement query = connection.createStatement();
    query.executeQuery("select * from ANIMAL");
    ResultSet zooResults = query.getResultSet();

    String columnString = "TYPE, ANIMAL_ID";
    for (String handlerColumn : COLUMNS) {
      columnString += ", " + handlerColumn;
    }
    while (zooResults.next()) {
      for (String prefix : PREFIXES) {
        String valuesString = "";
        if (prefix.equals("GOPHER_")) {
          valuesString += "'PLATYPUS'";
        } else if (prefix.equals("LLAMA_")) {
          valuesString += "'DOLLY'";
        }

        valuesString += "," + prefix;

        for (String column : COLUMNS) {
          valuesString += "," + column;
        }

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block should never run
          valuesString += ", 'UNREACHABLE'";
        } else {
          // This block will always run
          valuesString += ", 'REACHABLE'";
        }

        connection
           .createStatement()
           .executeUpdate(
                "insert into HANDLER (" + columnString + ") VALUES (" + valuesString + ");");
      }
    }
  }

  public void beSafeSimple() throws SQLException {
    Statement query = connection.createStatement();
    query.executeQuery("select * from ANIMAL");
    ResultSet zooResults = query.getResultSet();

    String columnString = "TYPE, ANIMAL_ID";
    connection
       .createStatement()
       .executeUpdate("insert into HANDLER (" + columnString + ") VALUES (" + PREFIXES[0] + ");");

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never run
      connection.createStatement().executeUpdate("insert into HANDLER (TYPE) VALUES ('UNREACHABLE');");
    } else {
      // This block will always run
      connection.createStatement().executeUpdate("insert into HANDLER (TYPE) VALUES ('REACHABLE');");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}