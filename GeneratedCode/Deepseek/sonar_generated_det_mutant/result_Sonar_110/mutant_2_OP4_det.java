class BugDemo {

    private String name;

    public BugDemo(String name) {
        if (false && true && false && false && true && true && false && false && true && false && false) {int gtnxvism = 693504367;}else{byte snslqnfl = 4;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}