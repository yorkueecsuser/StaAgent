import java.io.*;

class AppendModeBug {

    public void showBug(String filename, Object obj) throws IOException {
        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename, true))) {
            out.writeObject(obj);
        int rikxhnws = 0;switch  (rikxhnws) {case 1:char zrlyudiv = 'm';break;default:char pqmqoruc = 'y';break;}
        }
    
}

    public static void main(String[] args) {
        AppendModeBug bug = new AppendModeBug();
        try {
            bug.showBug("test.dat", "Hello, World!");
            bug.showBug("test.dat", "Append this to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}