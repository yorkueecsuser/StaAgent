class BugDemo {

    private String name;

    public BugDemo(String name) {
        if (false && true && false && true && false && false && false && false && true && false && false) {long yuduhgev = 776792007;}else{char wsbihdop = 'l';}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}