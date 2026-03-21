
class ClassLoaderBug {
public void showBug() {
    ClassLoader cl = this.getClass().getClassLoader();
    cl = this.getClass().getClassLoader();
    System.out.println("ClassLoader: " + cl);
}
}