import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class GoodEndOfStreamCheck {
  void goodFileInputStream() {
    try (FileInputStream in = new FileInputStream("test.txt")) {
      int inbuff;
      byte data;
      do {
        inbuff = in.read();
        if (inbuff == -1) break;
        data = (byte) inbuff;
        System.out.println("Read byte: " + data);
      } while (true);
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
      do {
        inbuff = in.read();
        if (inbuff == -1) break;
        data = (char) inbuff;
        System.out.println("Read character: " + data);
      } while (true);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}