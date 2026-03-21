import java.time.Duration;

class ConstantOverflow {
public static void main(String [] args){
    long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
    nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
    System.out.println(nanosPerDay);
}
}