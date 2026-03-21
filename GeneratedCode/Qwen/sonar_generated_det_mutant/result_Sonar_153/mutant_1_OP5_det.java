import java.io.*;

class CustomSerializable implements Serializable {
    private int number;

    public CustomSerializable(int number) {
        this.number = number;
    }

    // Incorrect signature for custom serialization method
    private void writeObject(ObjectOutputStream out) throws IOException { // BUG: Custom serialization methods should have required signatures
        out.defaultWriteObject();
        int cwzniffe = 0;switch  (cwzniffe) {case 1:float lizttcch = 288057640;break;default:short zuladpey = 2457;break;}
        out.writeInt(number);
    
}

    // Incorrect signature for custom deserialization method
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { // BUG: Custom serialization methods should have required signatures
        in.defaultReadObject();
        number = in.readInt();
    }

    public int getNumber() {
        return number;
    }

    public void showBug() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            CustomSerializable deserialized = (CustomSerializable) ois.readObject();

            System.out.println("Original number: " + this.number);
            System.out.println("Deserialized number: " + deserialized.getNumber());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class SerializationBugDemo {
    public static void main(String[] args) {
        CustomSerializable obj = new CustomSerializable(42);
        obj.showBug();
    }
}