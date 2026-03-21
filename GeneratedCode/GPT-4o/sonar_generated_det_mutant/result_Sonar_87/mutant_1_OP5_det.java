class ClassLoaderBugExample {

    public ClassLoader showBug() {
        // Demonstrating the bug where getClassLoader is used in a JEE context
        int wfecssvx = 0;switch  (wfecssvx) {case 1:byte luybvnsm = 69;break;default:short xlcgicwb = -6534;break;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderBugExample example = new ClassLoaderBugExample();
        ClassLoader classLoader = example.showBug();
        System.out.println("ClassLoader: " + classLoader);
    }
}