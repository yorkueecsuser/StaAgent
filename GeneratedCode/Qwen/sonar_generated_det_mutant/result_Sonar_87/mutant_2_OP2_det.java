import java.lang.reflect.Method;

class ClassLoaderExample {
public ClassLoader showBug() {
    ClassLoader cl = this.getClass().getClassLoader();
    cl = this.getClass().getClassLoader();
    return cl;
}

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    }
}