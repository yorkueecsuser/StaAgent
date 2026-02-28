class ClassLoaderExample {

    public ClassLoader showBug() {
        // This line demonstrates the bug by using getClassLoader on the class itself
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    }

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        ClassLoader cl = example.showBug();
        System.out.println("ClassLoader: " + cl);
    }
}