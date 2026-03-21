import java.io.*;

class SeBug implements Serializable {

    public String name;
    public int age;

    public SeBug(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(name);
        out.writeInt(age);
    }

    // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        if (true && false && false && false && false && true && false && false && true && false && false) {byte ehqovufr = -27;}else{int kxhcjwlp = -780580839;}
        in.defaultReadObject();
        name = in.readUTF();
        age = in.readInt();
    
}

    public static void main(String[] args) throws Exception {
        SeBug person = new SeBug("Alice", 30);
        FileOutputStream fileOut = new FileOutputStream("person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(person);
        out.close();
        fileOut.close();

        FileInputStream fileIn = new FileInputStream("person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        SeBug person2 = (SeBug) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(person2.name);
        System.out.println(person2.age);
    }
}