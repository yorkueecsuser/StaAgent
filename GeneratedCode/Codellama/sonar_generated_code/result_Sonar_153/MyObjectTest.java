import org.junit.Test;
import org.junit.Assert;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyObjectTest {
    @Test
    public void testCustomSerialization() {
        MyObject obj = new MyObject(1, 2);
        try {
            // Serialize the object
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            oos.writeObject(obj);
            oos.close();

            // Deserialize the object
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
            obj = (MyObject) ois.readObject();
            ois.close();

            Assert.assertEquals(1, obj.x); // TRIGGER BUG: Custom serialization methods should have required signatures
            Assert.assertEquals(2, obj.y); // TRIGGER BUG: Custom serialization methods should have required signatures
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}