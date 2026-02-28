/* ****************************************
 * $Id$
 * SF bug Bug2177967:
 *   Missed open stream warning
 *
 * JVM:  1.5.0_16 (OS X, PPC)
 * FBv:  1.3.7-dev-20081215
 *
 * Test case based on example code from bug report
 *
 * Test class has inner class an return open stream, which is never closed.
 * An open stream warning seems like it would be appropriate in this case,
 * since the test method leaves the returned FileInputStream open when
 * it returns.
 *
 * **************************************** */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class Bug2177967 {

  Properties properties = new Properties();

  public void init(Class loader, String propertiesFile) throws IOException {

    // Load the properties from the file
    InputStream in = loader.getResourceAsStream(propertiesFile);
    if (in == null) {
      throw new RuntimeException("Cound not locate " + propertiesFile);
    }
    properties.load(in);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  public void init(String propertiesFile) throws IOException {

    // Load the properties from the file
    InputStream in = new FileInputStream(propertiesFile);
    if (in == null) {
      throw new RuntimeException("Cound not locate " + propertiesFile);
    }
    properties.load(in);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    // Always returns false, making the if block unreachable
    return false;
  }
}