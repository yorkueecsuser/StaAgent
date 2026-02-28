import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TransientFieldOfNonserializableClass {
  public transient int super_test = 1;

  public TransientFieldOfNonserializableClass() {
    System.out.println("Constructing a TransientFieldOfNonserializableClass");
  }

  public void setTest(int t) {
    super_test = t;
  }

  static class Sub extends TransientFieldOfNonserializableClass implements Serializable {
    public int sub_test = 2;

    public Sub() {
      System.out.println("Constructing Sub");
    }

    public static void main(String[] args) {
      try {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        Sub s = new Sub();
        s.setTest(99);
        s.sub_test = 98;
        oos.writeObject(s);
        oos.flush();
        byte[] data = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bais);
        s = (Sub) ois.readObject();
        if (s.super_test == 99) System.out.println("Super class data serialized");
        else if (s.super_test == 1)
          System.out.println("Super class data initialized in constructor");
        if (s.sub_test == 98) System.out.println("Sub class data serialized");
        else if (s.super_test == 2) System.out.println("Sub class data initialized in constructor");

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  // Mutated code
  static class SubMutant extends TransientFieldOfNonserializableClass implements Serializable {
    public int x = 2; // Renamed sub_test to x

    public SubMutant() {
      System.out.println("Constructing SubMutant");
    }

    public static void main(String[] args) {
      try {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        SubMutant m = new SubMutant();
        m.setTest(99);
        m.x = 98; // Updated sub_test to x
        oos.writeObject(m);
        oos.flush();
        byte[] data = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bais);
        m = (SubMutant) ois.readObject();
        if (m.super_test == 99) System.out.println("Super class data serialized");
        else if (m.super_test == 1)
          System.out.println("Super class data initialized in constructor");
        if (m.x == 98) System.out.println("Sub class data serialized"); // Updated sub_test to x
        else if (m.super_test == 2) System.out.println("Sub class data initialized in constructor");

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}