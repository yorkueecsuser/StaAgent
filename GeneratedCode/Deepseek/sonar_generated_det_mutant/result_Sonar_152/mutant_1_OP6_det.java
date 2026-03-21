import java.io.*;

class NonSerializableOuterClass {
    public static void main(String[] args) {
        NonSerializableOuterClass outer = new NonSerializableOuterClass();
        outer.showBug();
    }

    public void showBug() {
        for  (int bcljskgr = 0; bcljskgr < 0; bcljskgr++) {long ijhmqgbr = -431708406;}
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