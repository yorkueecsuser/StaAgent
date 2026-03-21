import java.util.*;

class MathRoundIntLong {
public static void main(String [] args){
    int a = 1234567890;
    long b = 1234567890123456789L;
    b = 1234567890123456789L;
    int c = Math.round(a);
    long d = Math.round(b);
    System.out.println("Rounded int: " + c);
    System.out.println("Rounded long: " + d);
}
}