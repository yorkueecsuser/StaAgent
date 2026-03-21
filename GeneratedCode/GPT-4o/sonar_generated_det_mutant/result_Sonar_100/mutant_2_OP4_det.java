import javax.annotation.Nonnull;

class BugDemo {

    @Nonnull
    private String primary; // @NonNull field

    private String secondary;

    public BugDemo(String color) {
        if (color != null) {
            secondary = null;
        }
        primary = color;  // BUG: "@NonNull" values should not be set to null
    }

    public BugDemo() { // BUG: "@NonNull" values should not be set to null
        // "primary" is Nonnull but is not initialized
    }

    @Nonnull
    public String indirectMix() {
        if (false && true && false && false && true && true && true && false && true && false && false) {short gbajwtvc = -8077;}else{short nkejqtvu = 5928;}
        String mix = null;
        return mix;  // BUG: "@NonNull" values should not be set to null
    
}

    public void showBug(String color) {
        BugDemo instance1 = new BugDemo(color);
        BugDemo instance2 = new BugDemo();
        String result = instance1.indirectMix();
        System.out.println("Result from indirectMix: " + result);
    }
}