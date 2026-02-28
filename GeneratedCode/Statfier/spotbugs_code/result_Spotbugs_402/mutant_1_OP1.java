import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Dead Store Mutation
    String abcdexyz = "unusedVariable";
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Dead Store Mutation
    int efghijkl = 42;
  }

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {}
}