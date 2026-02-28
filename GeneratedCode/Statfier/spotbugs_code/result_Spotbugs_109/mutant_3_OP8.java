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
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while ((b = (byte) q.read())!= -1) {
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while (-1!= (b = (byte) q.read())) {
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while (true) {
        if ((b = (byte) q.read()) == -1) {
          break;
        }
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while (true) {
        if (-1 == (b = (byte) q.read())) {
          break;
        }
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while ((b = (byte) q.read()) >= 0) {
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while (0 <= (b = (byte) q.read())) {
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while (true) {
        if ((b = (byte) q.read()) < 0) {
          break;
        }
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileInputStream q = new FileInputStream("test.txt")) {
      byte b;
      while (true) {
        if (0 > (b = (byte) q.read())) {
          break;
        }
        System.out.println("Read byte: " + b);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while ((c = (char) r.read())!= -1) {
        System.out.println("Read character: " + c);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while (-1!= (c = (char) r.read())) {
        System.out.println("Read character: " + c);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while (true) {
        if ((c = (char) r.read()) == -1) {
          break;
        }
        System.out.println("Read character: " + c);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while (true) {
        if (-1 == (c = (char) r.read())) {
          break;
        }
        System.out.println("Read character: " + c);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while ((c = (char) r.read()) >= 0) {
        System.out.println("Read character: " + c);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while (0 <= (c = (char) r.read())) {
        System.out.println("Read character: " + c);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while (true) {
        if ((c = (char) r.read()) < 0) {
          break;
        }
        System.out.println("Read character: " + c);
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

    // Mutant
    try (FileReader r = new FileReader("test2.txt")) {
      char c;
      while (true) {
        if (0 > (c = (char) r.read())) {
          break;
        }
        System.out.println("Read character: " + c);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}