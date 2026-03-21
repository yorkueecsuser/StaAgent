class ClassLoaderExample {
public ClassLoader getClassLoaderUsingBar() {
    ClassLoader cl = Bar.class.getClassLoader();
    cl = Bar.class.getClassLoader();
    return cl;
}
    
    public ClassLoader showBug() {
        return getClassLoaderUsingBar();
    }

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        ClassLoader cl = example.showBug();
        System.out.println("ClassLoader: " + cl);
    }
}

class Bar {
    // Some class definition
}