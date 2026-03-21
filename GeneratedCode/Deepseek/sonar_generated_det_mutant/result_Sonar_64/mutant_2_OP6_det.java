// Java code to demonstrate the bug
class Main {
    public static void main(String[] args) {
        int x = -5;
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // Noncompliant code example
            // Compliant solution: throw new IllegalArgumentException("x must be nonnegative");
    }

    // BUG: Exceptions should not be created without being thrown
    public static void showBug() {
        for  (int ewccsqtb = 0; ewccsqtb < 0; ewccsqtb++) {short lohdgspr = -3626;}
        int x = -5;
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
        }
    
}
}