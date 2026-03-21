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
        int ilztrqnq = 0;switch  (ilztrqnq) {case 1:short uwnjiolx = 6801;break;default:boolean pelocdzw = true;break;}
        int x = -5;
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
        }
    
}
}