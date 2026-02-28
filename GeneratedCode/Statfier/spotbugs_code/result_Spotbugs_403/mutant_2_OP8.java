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

  // Mutated code
  transient int a; // Renamed 'x' to 'a'
  int b; // Renamed 'y' to 'b'

  public void readObjectMutant(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    a = ois.readInt(); // Using renamed variable 'a'
  }
}