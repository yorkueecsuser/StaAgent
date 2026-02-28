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
    int i = 0;
    do {
      columnString += ", " + COLUMNS[i];
      i++;
    } while (i < COLUMNS.length);
    while (zooResults.next()) {
      int j = 0;
      do {
        String valuesString = "";
        if (PREFIXES[j].equals("GOPHER_")) {
          valuesString += "'PLATYPUS'";
        } else if (PREFIXES[j].equals("LLAMA_")) {
          valuesString += "'DOLLY'";
        }

        valuesString += "," + PREFIXES[j];

        int k = 0;
        do {
          valuesString += "," + COLUMNS[k];
          k++;
        } while (k < COLUMNS.length);

        connection
           .createStatement()
           .executeUpdate(
                "insert into HANDLER (" + columnString + ") VALUES (" + valuesString + ");");
        j++;
      } while (j < PREFIXES.length);
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
  }
}