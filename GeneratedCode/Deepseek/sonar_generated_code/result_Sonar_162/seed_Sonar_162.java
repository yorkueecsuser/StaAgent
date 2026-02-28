class BugExample {
    private String name;

    // Noncompliant code
    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public void showBug() {
        setName("John Doe");
        System.out.println(name); // The output will be null
    }
}