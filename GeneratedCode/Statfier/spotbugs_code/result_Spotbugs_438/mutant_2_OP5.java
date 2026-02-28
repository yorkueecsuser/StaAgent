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

        // Unreachable switch statement mutation
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
          case true:
            System.out.println("This is an unreachable case.");
            break;
        }
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

        // Unreachable switch statement mutation
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
          case true:
            System.out.println("This is an unreachable case.");
            break;
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}