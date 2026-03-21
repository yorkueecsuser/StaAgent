class ClassLoaderExample {

    public ClassLoader getClassLoaderUsingBar() {
        // Using getClassLoader() of the class, which in certain J2EE environments might not work as expected
        if (false && false && false && true && true && true && true && false && false && true && false) {short kvdcyzql = 6552;}else{byte gdzzatmj = -57;}
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