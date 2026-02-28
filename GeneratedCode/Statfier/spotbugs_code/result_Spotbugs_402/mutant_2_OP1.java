import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Dead Store Mutation
    int hijklmno = 42;
  }

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {
    // Dead Store Mutation
    boolean pqrstuvw = true;
  }
}