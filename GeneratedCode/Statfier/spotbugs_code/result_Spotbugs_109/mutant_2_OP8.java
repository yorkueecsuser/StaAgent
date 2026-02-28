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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while ((y = (byte) x.read())!= -1) {
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while (-1!= (y = (byte) x.read())) {
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while (true) {
        if ((y = (byte) x.read()) == -1) {
          break;
        }
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while (true) {
        if (-1 == (y = (byte) x.read())) {
          break;
        }
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while ((y = (byte) x.read()) >= 0) {
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while (0 <= (y = (byte) x.read())) {
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while (true) {
        if ((y = (byte) x.read()) < 0) {
          break;
        }
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileInputStream x = new FileInputStream("test.txt")) {
      byte y;
      while (true) {
        if (0 > (y = (byte) x.read())) {
          break;
        }
        System.out.println("Read byte: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while ((y = (char) x.read())!= -1) {
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while (-1!= (y = (char) x.read())) {
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while (true) {
        if ((y = (char) x.read()) == -1) {
          break;
        }
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while (true) {
        if (-1 == (y = (char) x.read())) {
          break;
        }
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while ((y = (char) x.read()) >= 0) {
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while (0 <= (y = (char) x.read())) {
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while (true) {
        if ((y = (char) x.read()) < 0) {
          break;
        }
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
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

    // Mutant
    try (FileReader x = new FileReader("test2.txt")) {
      char y;
      while (true) {
        if (0 > (y = (char) x.read())) {
          break;
        }
        System.out.println("Read character: " + y);
      }
    } catch (FileNotFoundException z) {
      z.printStackTrace();
    } catch (IOException w) {
      w.printStackTrace();
    }
  }
}