import java.io.*;

record Record implements Serializable {
  private static final long serialVersionUID = 1L;

  private Object writeReplace() throws ObjectStreamException {
    System.out.println("writeReplace method called");
    return this;
  }

  private Object readResolve() throws ObjectStreamException {
    System.out.println("readResolve method called");
    return this;
  }

  private void writeObject(ObjectOutputStream out) throws IOException {
    System.out.println("writeObject method called"); // BUG: Members ignored during record serialization should not be used
  }

  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    System.out.println("readObject method called"); // BUG: Members ignored during record serialization should not be used
  }
}