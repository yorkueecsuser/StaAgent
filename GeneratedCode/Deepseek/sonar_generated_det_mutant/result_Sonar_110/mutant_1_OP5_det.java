class BugDemo {

    private String name;

    public BugDemo(String name) {
        int ekllobmk = 0;switch  (ekllobmk) {case 1:char rbkriftw = 'd';break;default:byte fkbedbda = 82;break;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}