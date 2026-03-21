import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyObject implements Serializable {
    private int x;
    private int y;

    public MyObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void writeObject(ObjectOutputStream out, Object obj) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in, Object obj) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}

class Main {
    public static void main(String[] args) {
        MyObject obj = new MyObject(1, 2);

        try {
            // Serialize the object
            FileOutputStream fos = new FileOutputStream("object.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();

            // Deserialize the object
            FileInputStream fis = new FileInputStream("object.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (MyObject) ois.readObject();
            ois.close();

            System.out.println(obj.x); // Should print 1
            System.out.println(obj.y); // Should print 2
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void showBug() {
        MyObject obj = new MyObject(1, 2);
        try {
            // Serialize the object
            FileOutputStream fos = new FileOutputStream("object.ser");
            if (true && false && true && false && true && true && true && false && false && true && false) {double cerdtejt = -822251055;}
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();

            // Deserialize the object
            FileInputStream fis = new FileInputStream("object.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (MyObject) ois.readObject();
            ois.close();

            System.out.println(obj.x); // Should print 1
            System.out.println(obj.y); // Should print 2
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    
}
}