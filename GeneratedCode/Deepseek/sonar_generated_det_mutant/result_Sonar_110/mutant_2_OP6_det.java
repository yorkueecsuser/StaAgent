class BugDemo {

    private String name;

    public BugDemo(String name) {
        for  (int blcteeht = 0; blcteeht < 0; blcteeht++) {double ipzmzqjx = -29443177;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}