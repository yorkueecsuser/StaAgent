import java.io.*;

class Main {

    static class InnerClass implements Serializable {
        String name;
        static int data = 10;

        public InnerClass(String name) {
            this.name = name;
        }

        public String toString() {
            return "InnerClass [name=" + name + ", data=" + data + "]";
        }
    }

    public static class OuterClass {
        InnerClass inner;

        public OuterClass(InnerClass inner) {
            this.inner = inner;
        }

        public String toString() {
            return "OuterClass [inner=" + inner + "]";
        }
    }

    public static void showBug() throws IOException, ClassNotFoundException {
        InnerClass inner = new InnerClass("InnerName");
        OuterClass outer = new OuterClass(inner);

        boolean condition = false;
        if (condition) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
                out.writeObject(outer); // This line contains the bug
            }
        } else {
            System.out.println("Unreachable code");
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"))) {
            OuterClass deserializedOuter = (OuterClass) in.readObject();
            System.out.println(deserializedOuter);
        }
    }

    public static void main(String[] args) throws Exception {
        showBug();
    }
}