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
    } catch (FileNotFoundException a) {
      a.printStackTrace();
    } catch (IOException b) {
      b.printStackTrace();
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
    try (FileReader w = new FileReader("test2.txt")) {
      char v;
      int u;
      while ((u = w.read())!= -1) {
        v = (char) u;
        System.out.println("Read character: " + v);
      }
    } catch (FileNotFoundException c) {
      c.printStackTrace();
    } catch (IOException d) {
      d.printStackTrace();
    }
  }
}