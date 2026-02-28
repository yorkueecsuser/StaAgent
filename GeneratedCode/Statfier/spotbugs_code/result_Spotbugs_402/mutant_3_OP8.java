import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {}
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {}

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {}
  
  // Mutated code
  private synchronized void readObject(ObjectInputStream x) throws IOException {}

  private synchronized void writeObject(ObjectOutputStream y) throws IOException {}
}