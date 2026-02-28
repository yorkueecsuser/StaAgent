import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NotSerializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {}
  // Mutant: Renaming 'in' to 'a'
  private synchronized void readObject(ObjectInputStream a) throws IOException {}
}

class ReadObject implements Serializable {
  private synchronized void readObject(ObjectInputStream in) throws IOException {}
  // Mutant: Renaming 'in' to 'b'
  private synchronized void readObject(ObjectInputStream b) throws IOException {}

  private synchronized void writeObject(ObjectOutputStream in) throws IOException {}
  // Mutant: Renaming 'in' to 'c'
  private synchronized void writeObject(ObjectOutputStream c) throws IOException {}
}