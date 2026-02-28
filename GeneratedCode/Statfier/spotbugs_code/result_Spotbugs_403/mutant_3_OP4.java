import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class PublicReadObject implements Serializable {
  transient int x;

  int y;

  public void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    x = ois.readInt();

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      x = x + 1;
    } else {
      // This block is unreachable because shouldRun is always false
      y = y - 1;
    }
  }

  private boolean getCondition() {
    return false;
  }
}