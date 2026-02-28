import java.util.Random;

class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        // Mutant Code - Dead Store
        int deadStore = new Random().nextInt();
        return cl;
    }
}