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

  // Mutant code
  transient int a;

  int b;

  public void readObject(ObjectInputStream ois, boolean mutant) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    a = ois.readInt();
  }
}