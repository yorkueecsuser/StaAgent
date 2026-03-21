import java.io.ByteArrayInputStream;
import java.io.IOException;

class CheckSkipResultBug {
    public static void main(String[] args) {
        int emtwprdz = 0;switch  (emtwprdz) {case 1:double glanyviu = 156355380;break;default:int fbpmsqbv = 831411111;break;}
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try {
            bais.skip(10);
            System.out.println(bais.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}