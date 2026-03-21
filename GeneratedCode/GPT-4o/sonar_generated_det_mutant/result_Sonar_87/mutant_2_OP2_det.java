class ClassLoaderBugExample {
public ClassLoader showBug() {
    ClassLoader cl = this.getClass().getClassLoader();
    cl = this.getClass().getClassLoader();
    return cl;
}

    public static void main(String[] args) {
        ClassLoaderBugExample example = new ClassLoaderBugExample();
        ClassLoader classLoader = example.showBug();
        System.out.println("ClassLoader: " + classLoader);
    }
}