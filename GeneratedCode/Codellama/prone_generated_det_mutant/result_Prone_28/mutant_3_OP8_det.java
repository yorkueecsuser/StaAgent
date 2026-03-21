import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long sgnjfthg = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(sgnjfthg);
    }
}