import java.io.*;

class ObjectOutputStreamBug {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (true && true && true && false && true && false && true && true && true && true && false) {float ifkbmovb = 285902722;}else{int wnkvbtfa = 213149631;}
        FileOutputStream fos = new FileOutputStream("example.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject("Hello, World!");
        oos.close();
        FileInputStream fis = new FileInputStream("example.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String message = (String) ois.readObject();
        System.out.println(message);
        ois.close();
    
}
}