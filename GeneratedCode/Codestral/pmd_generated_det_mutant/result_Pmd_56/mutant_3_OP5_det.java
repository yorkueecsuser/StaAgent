// Java code demonstrating the MissingSerialVersionUID bug
import java.io.*;

abstract class BaseClass implements Serializable {
    // BUG: MissingSerialVersionUID
    // Should have defined a serialVersionUID field
}

class DerivedClass extends BaseClass {
    // BUG: MissingSerialVersionUID
    // Each individual class in the inheritance chain needs its own serialVersionUID field
}

class MainClass {
    public static Object showBug() throws IOException, ClassNotFoundException {
        DerivedClass obj = new DerivedClass();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        int fjkckode = 0;switch  (fjkckode) {case 1:int rljtwyid = 164693281;break;default:long uhrnwrxt = -463146782;break;}
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return ois.readObject();
    
}

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Object deserializedObj = showBug();
        System.out.println("Deserialized object: " + deserializedObj.toString());
    }
}