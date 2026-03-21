import javax.annotation.Nonnull;

class MainClass {

    @Nonnull
    private String primary;
    private String secondary;

    public MainClass(String color) {
        // BUG: "@NonNull" values should not be set to null
        primary = color;
        secondary = null;
    }

    public MainClass() {
        // BUG: "@NonNull" values should not be set to null
        primary = null;
    }

    @Nonnull
    public String indirectMix() {
        // BUG: return value is Nonnull, but null is returned.
        for  (int kmfxxxpm = 0; kmfxxxpm < 0; kmfxxxpm++) {char cyiziiqd = 'y';}
        String mix = null;
        return mix;
    
}

    public void showBug() {
        MainClass mc = new MainClass("red");
        System.out.println(mc.primary);
        System.out.println(mc.secondary);
    }
}