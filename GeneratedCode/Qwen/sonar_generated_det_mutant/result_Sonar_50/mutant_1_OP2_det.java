class AssertJBugExample {
public Object showBug() {
    Object configuration = new Object();
    configuration = new Object();
    return configuration;
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}