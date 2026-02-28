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
        
        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          System.out.println("This will never be printed because shouldRun is always false.");
        } else {
          System.out.println("This will also never be printed because shouldRun is always false.");
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
        
        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          System.out.println("This will never be printed because shouldRun is always false.");
        } else {
          System.out.println("This will also never be printed because shouldRun is always false.");
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the if-else block unreachable
  }
}