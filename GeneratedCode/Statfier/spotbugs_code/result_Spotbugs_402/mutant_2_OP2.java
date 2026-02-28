import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    int temp = 0; // Hypothetical assignment statement
    int temp = 0; // Duplicate of the above assignment statement
  }
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {
    int temp = 1; // Hypothetical assignment statement
    int temp = 1; // Duplicate of the above assignment statement
  }

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {
    int temp = 2; // Hypothetical assignment statement
    int temp = 2; // Duplicate of the above assignment statement
  }
}