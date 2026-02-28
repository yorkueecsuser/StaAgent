import java.util.Random;

class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        int abcdefgh = new Random().nextInt(); // Dead Store
        return cl;
    }
}