import java.io.*;

class ObjectOutputStreamBug {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("example.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject("Hello, World!");
        oos.close();
        FileInputStream fis = new FileInputStream("example.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String message = (String) ois.readObject();
        System.out.println(message);
        ois.close();

        // Mutation operator: Unreachable for loop
        // Description: Insert unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false.
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Code inside the for loop is unreachable
        }
    }
}