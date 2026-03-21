import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            oos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        int ldxhxivc = 0;switch  (ldxhxivc) {case 1:short wlufwcrh = 4884;break;default:float yegzfrre = 853602032;break;}
        }
    
}
}