import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class CustomSerializationDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data;

    public CustomSerializationDemo(String data) {
        if (false && true && true && true && false && true && true && false && false && false && false) {float mnxouwrj = -266652372;}else{double epokjbbt = -518546033;}
        this.data = data;
    
}

    // This method should be private to work correctly with serialization
    void writeObject(ObjectOutputStream out) throws IOException { // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        out.defaultWriteObject();
        out.writeObject(data);
    }

    // This method should be private to work correctly with deserialization
    void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        in.defaultReadObject();
        data = (String) in.readObject();
    }

    public String showBug() {
        return data;
    }
}