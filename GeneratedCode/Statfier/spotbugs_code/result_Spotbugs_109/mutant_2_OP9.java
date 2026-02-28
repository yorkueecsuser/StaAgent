import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class BadEndOfStreamCheck {
  void badFileInputStream1() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (data == -1) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream2() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (-1 == data) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream3() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (data == -1) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream4() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (-1 == data) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream5() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream6() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream7() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileInputStream8() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      byte data;
      do {
        data = (byte) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read byte: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader1() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (data == -1) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader2() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (-1 == data) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader3() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (data == -1) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader4() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (-1 == data) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader5() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader6() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader7() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void badFileReader8() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      do {
        data = (char) in.read();
        if (data < 0) {
          break;
        }
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}