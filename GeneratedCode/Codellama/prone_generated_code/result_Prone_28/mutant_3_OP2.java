import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);
        // Mutant 1: Duplicate assignment of nanosPerDay
        long nanosPerDayDup = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDayDup);
    }
}