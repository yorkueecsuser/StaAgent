import java.lang.System;

class BuggyCode {
    public float showBug() {
        float a = 3.146f; // Mutated variable renamed from myNumber
        if (a == 3.146f) {
            System.out.println("a is equal to 3.146");
        }
        if (a!= 3.146f) { // Mutated variable renamed from myNumber
            System.out.println("a is not equal to 3.146");
        }
        if (a < 4 || a > 4) { // Mutated variable renamed from myNumber
            System.out.println("a is less than 4 or greater than 4");
        }
        float b = 0.0f; // Mutated variable renamed from zeroFloat
        if (b == 0) { // Mutated variable renamed from zeroFloat
            System.out.println("b is equal to 0");
        }
        return a;
    }
}