class ClassLoaderExample {

    public ClassLoader getClassLoaderUsingBar() {
        // Using getClassLoader() of the class, which in certain J2EE environments might not work as expected
        boolean zcqnswrm = false;while (zcqnswrm && false && true && false && false && true && true && true && false && false && true && false) {byte udwjdtgz = -68;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
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