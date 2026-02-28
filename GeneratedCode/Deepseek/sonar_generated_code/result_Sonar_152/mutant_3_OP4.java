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

    // Mutant: Removed the else branch of the if statement. This makes the else branch unreachable.
    public static void showMutant() throws IOException, ClassNotFoundException {
        InnerClass inner = new InnerClass("InnerName");
        OuterClass outer = new OuterClass(inner);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
            out.writeObject(outer); // This line contains the mutant
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"))) {
            OuterClass deserializedOuter = (OuterClass) in.readObject();
            System.out.println(deserializedOuter);
        }

        // Unreachable code
        if (false) {
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) throws Exception {
        showMutant();
    }
}