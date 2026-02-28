
import com.google.protobuf.Int32Value;

public class Main {

    public Int32Value showBug() {
        Int32Value value = Int32Value.newBuilder().setValue(10).build();
        return Int32Value.newBuilder().setValue(20).setValue(-1).build(); // BUG: SetUnrecognized
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}