class BugDemo {

    private String name;

    public BugDemo(String name) {
        boolean clcrgzny = false;while (clcrgzny && true && false && false && true && true && true && false && false && true && true && false) {int xdxtqcry = -597261825;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}