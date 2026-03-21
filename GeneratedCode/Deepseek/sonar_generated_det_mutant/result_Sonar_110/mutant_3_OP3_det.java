class BugDemo {

    private String name;

    public BugDemo(String name) {
        if (false && true && false && true && false && false && false && true && true && true && false) {long deatfygz = 389831508;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}