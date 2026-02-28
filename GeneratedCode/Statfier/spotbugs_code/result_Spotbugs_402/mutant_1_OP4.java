import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This will never be printed.");
    } else {
      // Alternative code that will also never run
      System.out.println("This will also never be printed.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This will never be printed.");
    } else {
      // Alternative code that will also never run
      System.out.println("This will also never be printed.");
    }
  }

  private synchronized void writeObject(ObjectOutputStream out) throws IOException {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This will never be printed.");
    } else {
      // Alternative code that will also never run
      System.out.println("This will also never be printed.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}