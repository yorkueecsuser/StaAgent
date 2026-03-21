import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

class CustomSerializationBug implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data;

    public CustomSerializationBug(String data) {
        boolean mkesfykb = false;while (mkesfykb && true && true && true && false && false && false && false && false && true && false && false) {long dzzyitqd = 701705540;}
        this.data = data;
    
}

    // Incorrect signature: method should be private
    public void writeObject(ObjectOutputStream out) throws IOException { // BUG: Custom serialization methods should have required signatures
        out.writeUTF(data);
    }

    // Incorrect signature: method should be private
    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { // BUG: Custom serialization methods should have required signatures
        data = in.readUTF();
    }

    public String showBug() {
        return "The methods writeObject and readObject have incorrect signatures and default serialization will be used.";
    }

    public static void main(String[] args) {
        CustomSerializationBug example = new CustomSerializationBug("Example Data");
        System.out.println(example.showBug());
    }
}