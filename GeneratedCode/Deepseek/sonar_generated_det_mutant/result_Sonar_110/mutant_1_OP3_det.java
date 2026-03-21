class BugDemo {

    private String name;

    public BugDemo(String name) {
        if (false && false && false && true && true && false && true && true && false && false && false) {byte vsviwuhu = -112;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}