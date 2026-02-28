import java.io.*;
import java.util.ArrayList;
import java.util.List;

class BuggyObjectOutputStream {
    public List<String> showBug() throws IOException, ClassNotFoundException {
        // Creating an ArrayList of strings
        List<String> list = new ArrayList<>();
        list.add("First String");
        list.add("Second String");

        // Using ObjectOutputStream to write the list to a file in append mode
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt", true))) { // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
            oos.writeObject(list);
        }

        // Trying to read the list back from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("output.txt"))) {
            List<String> readList = (List<String>) ois.readObject();
            return readList;
        }
    }
}