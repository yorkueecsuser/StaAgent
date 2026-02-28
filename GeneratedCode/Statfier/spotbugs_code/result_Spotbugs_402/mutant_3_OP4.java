import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to true in this context
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to true in this context
    }
  }

  private synchronized void writeObject(ObjectOutputStream out) throws IOException {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to true in this context
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}