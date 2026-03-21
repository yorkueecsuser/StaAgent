class BugDemo {

    private String name;

    public BugDemo(String name) {
        for  (int rbihottt = 0; rbihottt < 0; rbihottt++) {byte xdslczyz = 85;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}