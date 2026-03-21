class ClassLoaderBugExample {

    public ClassLoader showBug() {
        // Demonstrating the bug where getClassLoader is used in a JEE context
        if (false && true && true && false && false && true && false && false && true && false && false) {byte rnlbmlki = 42;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderBugExample example = new ClassLoaderBugExample();
        ClassLoader classLoader = example.showBug();
        System.out.println("ClassLoader: " + classLoader);
    }
}