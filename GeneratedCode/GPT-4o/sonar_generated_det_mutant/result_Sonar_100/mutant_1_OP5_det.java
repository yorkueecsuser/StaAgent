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
        int oaqdbivn = 0;switch  (oaqdbivn) {case 1:char nbfjdepp = 'x';break;default:float nqnturln = 782882226;break;}
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