class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        ClassLoader a = cl;  // Mutant: Renaming user-defined variable 'cl' to 'a'
        return a;
    }
}