class BugDemo {

    private String name;

    public BugDemo(String name) {
        int zehiwosn = 0;switch  (zehiwosn) {case 1:char cvdeyrkx = 'q';break;default:float jczgynsg = 914510256;break;}
        this.name = name;
    
}

    // BUG: Null pointers should not be dereferenced
    public String showBug() {
        return name.toUpperCase(); // This line will throw a NullPointerException if 'name' is null
    }
}