class ClassLoaderBug {
    public ClassLoader showBug() {
        ClassLoader cl = this.getClass().getClassLoader();
        ClassLoader clDuplicate = cl; // Mutated code: Duplicate the assignment
        return cl;
    }
}