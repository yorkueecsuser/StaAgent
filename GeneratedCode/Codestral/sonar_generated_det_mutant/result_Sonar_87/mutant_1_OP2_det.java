class ClassLoaderBug {
public ClassLoader showBug() {
    ClassLoader cl = this.getClass().getClassLoader();
    cl = this.getClass().getClassLoader();
    return cl;
}
}