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
      // This block will never execute because getCondition() always returns false
      x = 0;
    } else {
      // This block will always execute
      y = 1;
    }
  }

  private boolean getCondition() {
    // Always return false to ensure the if branch is unreachable
    return false;
  }
}