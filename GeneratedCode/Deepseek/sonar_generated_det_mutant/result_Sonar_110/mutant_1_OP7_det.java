class BugDemo {

    private String name;

    public BugDemo(String name) {
        boolean xrbfebep = false;while (xrbfebep && false && true && false && true && true && true && true && false && false && true && false) {float mdjucsct = 784829027;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}