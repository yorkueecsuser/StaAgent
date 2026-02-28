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

    // Mutant 1
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while ((q = (byte) z.read())!= -1) {
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 2
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while (-1!= (q = (byte) z.read())) {
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 3
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while (true) {
        if ((q = (byte) z.read()) == -1) {
          break;
        }
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 4
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while (true) {
        if (-1 == (q = (byte) z.read())) {
          break;
        }
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 5
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while ((q = (byte) z.read()) >= 0) {
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 6
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while (0 <= (q = (byte) z.read())) {
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 7
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while (true) {
        if ((q = (byte) z.read()) < 0) {
          break;
        }
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 8
    try (FileInputStream z = new FileInputStream("test.txt")) {
      byte q;
      while (true) {
        if (0 > (q = (byte) z.read())) {
          break;
        }
        System.out.println("Read byte: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 9
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while ((q = (char) z.read())!= -1) {
        System.out.println("Read character: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 10
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while (-1!= (q = (char) z.read())) {
        System.out.println("Read character: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 11
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while (true) {
        if ((q = (char) z.read()) == -1) {
          break;
        }
        System.out.println("Read character: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 12
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while (true) {
        if (-1 == (q = (char) z.read())) {
          break;
        }
        System.out.println("Read character: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 13
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while ((q = (char) z.read()) >= 0) {
        System.out.println("Read character: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 14
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while (0 <= (q = (char) z.read())) {
        System.out.println("Read character: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 15
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while (true) {
        if ((q = (char) z.read()) < 0) {
          break;
        }
        System.out.println("Read character: " + q);
      }
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant 16
    try (FileReader z = new FileReader("test2.txt")) {
      char q;
      while (true) {
        if (0 > (q = (char) z.read())) {
          break;
        }
        System.out.println("Read character: " + q);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}