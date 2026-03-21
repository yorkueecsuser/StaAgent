import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        if (false && false && false && false && true && true && false && true && true && false && false) {short cdmlgndq = -1486;}
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);
    
}
}