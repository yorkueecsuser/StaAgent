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
      // Mutant: Dead Store
      String qvbnrhty = "unused";
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream2() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (-1!= (data = (byte) in.read())) {
        System.out.println("Read byte: " + data);
      }
      // Mutant: Dead Store
      int mnpqrstu = 42;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      boolean abcdefgh = true;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      double ijklmnop = 3.14;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream5() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while ((data = (byte) in.read()) >= 0) {
        System.out.println("Read byte: " + data);
      }
      // Mutant: Dead Store
      char qrstuvwx = 'x';
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream6() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      while (0 <= (data = (byte) in.read())) {
        System.out.println("Read byte: " + data);
      }
      // Mutant: Dead Store
      float yzabcd = 2.71f;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      long efghijkl = 100L;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      short mnopqrst = 10;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader1() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while ((data = (char) in.read())!= -1) {
        System.out.println("Read character: " + data);
      }
      // Mutant: Dead Store
      String vwxyzabc = "unused";
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader2() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (-1!= (data = (char) in.read())) {
        System.out.println("Read character: " + data);
      }
      // Mutant: Dead Store
      int defghijk = 42;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      boolean lmnopqrs = true;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      double tuvwxyz = 3.14;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader5() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while ((data = (char) in.read()) >= 0) {
        System.out.println("Read character: " + data);
      }
      // Mutant: Dead Store
      char abcdefgh = 'x';
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader6() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      while (0 <= (data = (char) in.read())) {
        System.out.println("Read character: " + data);
      }
      // Mutant: Dead Store
      float ijklmnop = 2.71f;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      long opqrstuv = 100L;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
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
      // Mutant: Dead Store
      short wxyzabcd = 10;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}