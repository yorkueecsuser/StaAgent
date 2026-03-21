// BUG: MissingSerialVersionUID

import java.io.*;

class SerializationBug {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a new object
        SerializableObject obj = new SerializableObject();
        obj.setName("John Doe");
        obj.setAge(30);

        // Serialize the object
        FileOutputStream fos = new FileOutputStream("obj.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();

        // Deserialize the object
        FileInputStream fis = new FileInputStream("obj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableObject deserializedObj = (SerializableObject) ois.readObject();
        ois.close();

        // Print the object's name and age
        System.out.println(deserializedObj.getName());
        System.out.println(deserializedObj.getAge());
    }
}

class SerializableObject implements Serializable {
    private String name;
    private int age;

    // BUG: MissingSerialVersionUID

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
char dozajsax = 'j';

        return age;
    
}

    public void setAge(int age) {
        this.age = age;
    }
}