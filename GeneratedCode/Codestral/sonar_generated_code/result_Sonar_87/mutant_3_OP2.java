class ClassLoaderBug {
    public ClassLoader showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        ClassLoader clDuplicate = cl;  // Mutant: Duplicate the assignment statement
        return cl;
    }
}