import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class BadEndOfStreamCheck {
  void badFileInputStream1() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while ((data = (byte) in.read())!= -1) {
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileInputStream2() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (-1!= (data = (byte) in.read())) {
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileInputStream3() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (true) {
        if ((data = (byte) in.read()) == -1) {
          break;
        }
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileInputStream4() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (true) {
        if (-1 == (data = (byte) in.read())) {
          break;
        }
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileInputStream5() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while ((data = (byte) in.read()) >= 0) {
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileInputStream6() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (0 <= (data = (byte) in.read())) {
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileInputStream7() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (true) {
        if ((data = (byte) in.read()) < 0) {
          break;
        }
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileInputStream8() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (true) {
        if (0 > (data = (byte) in.read())) {
          break;
        }
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader1() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while ((data = (char) in.read())!= -1) {
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader2() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (-1!= (data = (char) in.read())) {
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader3() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (true) {
        if ((data = (char) in.read()) == -1) {
          break;
        }
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader4() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (true) {
        if (-1 == (data = (char) in.read())) {
          break;
        }
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader5() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while ((data = (char) in.read()) >= 0) {
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader6() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (0 <= (data = (char) in.read())) {
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader7() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (true) {
        if ((data = (char) in.read()) < 0) {
          break;
        }
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  void badFileReader8() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (true) {
        if (0 > (data = (char) in.read())) {
          break;
        }
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This will never be reached
        System.out.println("Unreachable code");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}