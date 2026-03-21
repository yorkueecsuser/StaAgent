class BugDemo {

    private String name;

    public BugDemo(String name) {
        this.name = name;
    }

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}