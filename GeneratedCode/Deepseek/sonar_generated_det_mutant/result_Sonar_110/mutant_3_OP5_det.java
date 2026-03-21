class BugDemo {

    private String name;

    public BugDemo(String name) {
        int sfsxcrgn = 0;switch  (sfsxcrgn) {case 1:char tknaxzkq = 'o';break;default:byte zonecuvg = -124;break;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}