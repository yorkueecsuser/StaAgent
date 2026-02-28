import java.util.*;

class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long b = 1234567890123456789L;
        int c = Math.round(a);
        long d = Math.round(b);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + d);
    }
}

// Mutant 1: Renaming variable "a" to "x"
class MathRoundIntLong {
    public static void main(String[] args) {
        int x = 1234567890;
        long b = 1234567890123456789L;
        int c = Math.round(x);
        long d = Math.round(b);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + d);
    }
}

// Mutant 2: Renaming variable "b" to "y"
class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long y = 1234567890123456789L;
        int c = Math.round(a);
        long d = Math.round(y);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + d);
    }
}

// Mutant 3: Renaming variable "c" to "z"
class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long b = 1234567890123456789L;
        int z = Math.round(a);
        long d = Math.round(b);
        System.out.println("Rounded int: " + z);
        System.out.println("Rounded long: " + d);
    }
}

// Mutant 4: Renaming variable "d" to "w"
class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long b = 1234567890123456789L;
        int c = Math.round(a);
        long w = Math.round(b);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + w);
    }
}