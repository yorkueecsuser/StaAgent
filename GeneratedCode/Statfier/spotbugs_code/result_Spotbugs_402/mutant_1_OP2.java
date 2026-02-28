import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    int x = 0; // Introduced assignment statement for demonstration
    int x = 0; // Duplicate of the introduced assignment statement
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    int y = 1; // Introduced assignment statement for demonstration
    int y = 1; // Duplicate of the introduced assignment statement
  }

  private synchronized void writeObject(ObjectOutputStream out) throws IOException {
    int z = 2; // Introduced assignment statement for demonstration
    int z = 2; // Duplicate of the introduced assignment statement
  }
}