class ClassLoaderBugExample {

    public ClassLoader showBug() {
        // Demonstrating the bug where getClassLoader is used in a JEE context
        int aerquxhg = 0;switch  (aerquxhg) {case 1:long ahfmeogt = -503116324;break;default:char kvvndetz = 'v';break;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderBugExample example = new ClassLoaderBugExample();
        ClassLoader classLoader = example.showBug();
        System.out.println("ClassLoader: " + classLoader);
    }
}