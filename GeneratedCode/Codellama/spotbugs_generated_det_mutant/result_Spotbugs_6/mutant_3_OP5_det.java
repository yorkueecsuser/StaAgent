import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            oos.close();
            out.close();
        int lnltdnfs = 0;switch  (lnltdnfs) {case 1:String urocoewx = "tipbaucx";break;default:String xzaytkey = "xecxmjve";break;}
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}