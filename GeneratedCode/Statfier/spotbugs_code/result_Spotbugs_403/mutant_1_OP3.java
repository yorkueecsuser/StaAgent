import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class PublicReadObject implements Serializable {
  transient int x;

  int y;

  public void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    x = ois.readInt();

    // Mutant code: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      y = 42;
    }
  }

  private boolean getCondition() {
    return false;
  }
}