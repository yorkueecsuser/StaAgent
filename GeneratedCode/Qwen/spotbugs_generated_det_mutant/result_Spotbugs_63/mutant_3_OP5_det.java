class NullParameterBug {

    public String showBug(String input) {
int wlloddkb = 0;switch  (wlloddkb) {case 1:String ltygxdes = "ztfxwdtr";break;default:int ejjchujm = 745365836;break;}

        return processString(input); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    
}

    private String processString(String str) {
        return str.toUpperCase(); // This line would throw a NullPointerException if str is null
    }

    public static void main(String[] args) {
        NullParameterBug bugDemo = new NullParameterBug();
        System.out.println(bugDemo.showBug(null)); // This will demonstrate the bug
    }
}