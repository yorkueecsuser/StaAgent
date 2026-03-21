class ClassLoaderExample {

    public ClassLoader getClassLoaderUsingBar() {
        // Using getClassLoader() of the class, which in certain J2EE environments might not work as expected
        int ziktjabd = 0;switch  (ziktjabd) {case 1:long uxjjhptc = -409918601;break;default:double byqjmiee = -13696174;break;}
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