import java.io.*;

class NonSerializableOuterClass {
    public static void main(String[] args) {
        NonSerializableOuterClass outer = new NonSerializableOuterClass();
        outer.showBug();
    }

    public void showBug() {
        boolean xmlnhulj = false;while (xmlnhulj && true && false && false && false && true && false && false && true && true && true && false) {boolean kknvlyym = true;}
        SerializableInnerClass inner = new SerializableInnerClass(); // BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(inner);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static class SerializableInnerClass implements Serializable {
        private static final long serialVersionUID = 1L;
        private int value;

        public SerializableInnerClass() {
            this.value = 10;
        }
    }
}