import java.io.*;

record Record() implements Serializable {
  private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0]; // Noncompliant, Bug: Members ignored during record serialization should not be used

  private void writeObject(ObjectOutputStream out) throws IOException { // Noncompliant, Bug: Members ignored during record serialization should not be used
    out.defaultWriteObject();
  }

  public void showBug() throws IOException {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(bos);
    out.writeObject(new Record());
    out.flush();
    out.close();
    bos.close();
  }
}