class BugDemo {

    private String name;

    public BugDemo(String name) {
        boolean yorffgfa = false;while (yorffgfa && false && true && false && false && false && false && true && true && true && true && false) {char nzqijyfs = 'h';}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}