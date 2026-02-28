import java.util.Random;

class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant

        // Mutation: Dead Store
        int deadStoreVariable = new Random().nextInt();

        return cl;
    }
}