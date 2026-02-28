import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
  }

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}