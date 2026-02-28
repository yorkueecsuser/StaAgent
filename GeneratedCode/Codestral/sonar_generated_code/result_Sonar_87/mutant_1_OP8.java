class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        ClassLoader a = cl; // mutant: renamed `cl` to `a`
        return a;
    }
}