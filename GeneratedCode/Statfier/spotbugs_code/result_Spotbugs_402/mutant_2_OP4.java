import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}