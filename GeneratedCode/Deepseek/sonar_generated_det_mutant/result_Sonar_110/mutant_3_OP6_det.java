class BugDemo {

    private String name;

    public BugDemo(String name) {
        for  (int zjqyzjjq = 0; zjqyzjjq < 0; zjqyzjjq++) {float norzoztf = -401860269;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}