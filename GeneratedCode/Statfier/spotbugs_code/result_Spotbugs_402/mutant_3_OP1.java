import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Dead Store Mutation
    String xwvutsrq = "abcdefgh";
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    // Dead Store Mutation
    int abcdefgh = 12345678;
  }

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {}
}