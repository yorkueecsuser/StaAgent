import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class GoodEndOfStreamCheck {
  void goodFileInputStream() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      int inbuff;
      byte data;
      while ((inbuff = in.read())!= -1) {
        data = (byte) inbuff;
        System.out.println("Read byte: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant code
    try (FileInputStream x = new FileInputStream("test.txt")) {
      int y;
      byte z;
      while ((y = x.read())!= -1) {
        z = (byte) y;
        System.out.println("Read byte: " + z);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void goodFileReader() {
    try (FileReader in = new FileReader("test2.txt")) {
      char data;
      int inbuff;
      while ((inbuff = in.read())!= -1) {
        data = (char) inbuff;
        System.out.println("Read character: " + data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Mutant code
    try (FileReader a = new FileReader("test2.txt")) {
      char b;
      int c;
      while ((c = a.read())!= -1) {
        b = (char) c;
        System.out.println("Read character: " + b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}