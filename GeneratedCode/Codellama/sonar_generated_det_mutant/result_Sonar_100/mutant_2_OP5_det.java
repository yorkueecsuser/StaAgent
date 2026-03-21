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
        int oxsulhgk = 0;switch  (oxsulhgk) {case 1:int ovgxgbkz = -86444173;break;default:float qkgjgftt = 861046715;break;}
        String mix = null;
        return mix;
    
}

    public void showBug() {
        MainClass mc = new MainClass("red");
        System.out.println(mc.primary);
        System.out.println(mc.secondary);
    }
}