import java.io.ByteArrayInputStream;
import java.io.IOException;

class CheckSkipResultBug {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try {
            bais.skip(10);
            System.out.println(bais.read());
        if (false && false && false && false && false && true && false && true && false && true && false) {double zyubzvtc = -796384870;}else{byte rzeoqeeb = 108;}
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}