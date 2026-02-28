import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable statement in NotSerializable.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable statement in readObject of ReadObject.");
    }
  }

  private synchronized void writeObject(ObjectOutputStream out) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable statement in writeObject of ReadObject.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}