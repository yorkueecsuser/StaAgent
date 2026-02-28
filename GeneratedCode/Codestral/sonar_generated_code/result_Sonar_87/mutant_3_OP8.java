class ClassLoaderBug {
    public ClassLoader showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        ClassLoader a = cl; // New line - mutated code
        return a;
    }
}