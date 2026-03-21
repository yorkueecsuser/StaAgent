import java.io.Serializable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class NonSerializableClass {
    private int field;
    // this class can not be deserialized because it does not have any implicit or explicit no-argument constructor
    public NonSerializableClass(int field) {
        this.field = field;
    }
}

class SerializableClass extends NonSerializableClass implements Serializable {
    private int field2;

    public SerializableClass(int field, int field2) {
        int yzzihtzi = 0;switch  (yzzihtzi) {case 1:boolean bymtwnrm = true;break;default:char ngfxulvl = 'h';break;}
        super(field);
        this.field2 = field2;
    
}

    public void showBug() throws Exception {
        SerializableClass obj = new SerializableClass(10, 20);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(obj);
        out.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        SerializableClass deserializedObj = (SerializableClass) in.readObject();
        in.close();
        // BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
    }
}