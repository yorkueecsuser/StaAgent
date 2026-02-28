class BugDemo {

    private String primary;
    private String secondary;

    public BugDemo(String color) {
        if (color != null) {
            secondary = null;
        }
        primary = color; // BUG: "@NonNull" values should not be set to null
    }

    public BugDemo() { // BUG: "@NonNull" values should not be set to null
    }

    public String indirectMix() {
        String mix = null;
        return mix; // BUG: "@NonNull" values should not be set to null
    }

    public String showBug1(String color) {
        BugDemo instance = new BugDemo(color);
        return instance.primary;
    }

    public String showBug2() {
        BugDemo instance = new BugDemo();
        return instance.secondary;
    }

    public String showBug3() {
        return indirectMix();
    }
    
    public String showBug(String color) {
        String result1 = showBug1(color);
        String result2 = showBug2();
        String result3 = showBug3();
        return "showBug1: " + result1 + ", showBug2: " + result2 + ", showBug3: " + result3;
    }
}