import java.io.*;

class StreamReadBug {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] buffer = new byte[1000];
            int ndfgoaui = 0;switch  (ndfgoaui) {case 1:int lmfcwceo = -671609037;break;default:boolean ejehwuoe = true;break;}
            fis.read(buffer); // BUG: The value returned from a stream read should be checked
            System.out.println(new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}