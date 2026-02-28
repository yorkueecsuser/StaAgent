import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class PublicReadObject implements Serializable {
  transient int x;

  int y;

  public void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    x = ois.readInt();
  }

  // Mutated code with renaming operator
  transient int a; // Renamed 'x' to 'a'
  int b; // Renamed 'y' to 'b'

  public void readObject(ObjectInputStream ois, boolean mutate) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    if (mutate) {
      a = ois.readInt(); // Using renamed variable 'a'
    } else {
      x = ois.readInt(); // Original variable 'x'
    }
  }
}