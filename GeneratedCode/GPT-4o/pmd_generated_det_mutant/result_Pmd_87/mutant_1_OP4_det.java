class ClassLoaderExample {

    public ClassLoader getClassLoaderUsingBar() {
        // Using getClassLoader() of the class, which in certain J2EE environments might not work as expected
        if (false && false && true && true && true && true && false && false && false && true && false) {float psnrumrq = -113883196;}else{String rqozyasw = "dcswjtiz";}
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