import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        String rando = "abcdefg"; // Dead Store mutant
        System.out.println(nanosPerDay);
    }
}